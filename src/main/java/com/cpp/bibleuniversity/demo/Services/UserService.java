package com.cpp.bibleuniversity.demo.Services;

import com.cpp.bibleuniversity.demo.Exceptions.Exception.DatabaseNotFoundException;
import com.cpp.bibleuniversity.demo.Exceptions.Exception.DuplicateAccountException;
import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Repository.UserRepo;
import com.cpp.bibleuniversity.demo.Requests.UserRequest.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser(SignUpRequest signUpRequest) {
        try {
            User user = new User();
            user.setPassword(bCryptPasswordEncoder.encode(signUpRequest.getPassword()));
            user.setUsername(signUpRequest.getUsername());
            user.setFirstname(signUpRequest.getFirstname());
            user.setLastname(signUpRequest.getLastname());
            user.setChinesename(signUpRequest.getChinesename());

            return userRepo.save(user);
        } catch (DatabaseNotFoundException e) {
            throw e;
        } catch(Exception e) {
            throw new DuplicateAccountException("Username '"+ signUpRequest.getUsername() +"' already exists");
        }
    }

    public List<User> findAllUsers() {
        return (ArrayList)userRepo.findAll();
    }

    public User findUserByName(String name) {
        User user = userRepo.findByUsername(name);
        if (user == null) {
            throw new DatabaseNotFoundException("User " + name + " not found!");
        }
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if(user==null) new UsernameNotFoundException("User not found");
        return user;
    }

    @Transactional
    public User loadUserById(Long id) {
        User user = userRepo.getById(id);
        if(user==null) new UsernameNotFoundException("User not found");
        return user;
    }


}
