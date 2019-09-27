package com.cpp.bibleuniversity.demo.Services;

import com.cpp.bibleuniversity.demo.Exceptions.Exception.DatabaseNotFoundException;
import com.cpp.bibleuniversity.demo.Exceptions.Exception.DuplicateAccountException;
import com.cpp.bibleuniversity.demo.Models.Role;
import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Models.UserRole;
import com.cpp.bibleuniversity.demo.Repository.RoleRepo;
import com.cpp.bibleuniversity.demo.Repository.UserRepo;
import com.cpp.bibleuniversity.demo.Requests.AdminRequest.RoleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private UserRepo userRepo;

    public Role createRole(RoleRequest roleRequest)
    {
        Role role = roleRepo.findRoleByName(roleRequest.getName());
        if (role != null)
        {
            throw new DuplicateAccountException("Rolename '" + role.getName() + "' already exists");
        }
        role = new Role(roleRequest.getName());
        return roleRepo.save(role);
    }

    public User addRoleToExistingUser(RoleRequest roleRequest){

        User user = userRepo.findByUsername(roleRequest.getUsername());
        if (user == null)
        {
            throw new DatabaseNotFoundException("User name '" + roleRequest.getUsername() + "' not found");
        }
        Role role = roleRepo.findRoleByName(roleRequest.getName());
        if (role == null)
        {
            throw new DatabaseNotFoundException("Rolename '" + roleRequest.getName() + "' not found");
        }

        UserRole userRole = new UserRole(user, role);
        user.getUserRoles().add(userRole);
        userRepo.save(user);
        return user;

    }
}
