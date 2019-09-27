package com.cpp.bibleuniversity.demo.Services;

import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Models.UserInfo;
import com.cpp.bibleuniversity.demo.Repository.UserInfoRepo;
import com.cpp.bibleuniversity.demo.Repository.UserRepo;
import com.cpp.bibleuniversity.demo.Requests.UserInfoRequest.UserInfoUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserInfoRepo userInfoRepo;

    public UserInfo createUpdateUserInfo(UserInfoUpdateRequest userInfoUpdateRequest, String username) {

         User user = userRepo.findByUsername(username);
         UserInfo userInfo = user.getUserInfo();
         if (userInfo == null){
             userInfo = new UserInfo();
             userInfo.setUser(user);
         }
         userInfo.setStreet(userInfoUpdateRequest.getStreet());
         userInfo.setCity(userInfoUpdateRequest.getCity());
         userInfo.setState(userInfoUpdateRequest.getState());
         userInfo.setZipcode(userInfoUpdateRequest.getZipcode());
         userInfo.setLanguage(userInfoUpdateRequest.getLanguage());
         userInfo.setDialect(userInfoUpdateRequest.getDialect());
         userInfo.setGender(userInfoUpdateRequest.getGender());
         userInfo.setPhone(userInfoUpdateRequest.getPhone());
         userInfo.setBirthday(userInfoUpdateRequest.getBirthday());
         userInfo.setBirthcity(userInfoUpdateRequest.getBirthcity());
         userInfo.setBirthnation(userInfoUpdateRequest.getBirthnation());
         userInfo.setAge(userInfoUpdateRequest.getAge());

         return userInfoRepo.save(userInfo);
    }

}
