package com.cpp.bibleuniversity.demo.Controllers;

import com.cpp.bibleuniversity.demo.Models.UserInfo;
import com.cpp.bibleuniversity.demo.Requests.UserInfoRequest.UserInfoUpdateRequest;
import com.cpp.bibleuniversity.demo.Services.MapValidationErrorService;
import com.cpp.bibleuniversity.demo.Services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/api/userinfo")
public class UserInfoController {

    @Autowired
    MapValidationErrorService mapValidationErrorService;

    @Autowired
    UserInfoService userInfoService;


    @PostMapping()
    public ResponseEntity<?> createUpdateUserInfo(@Valid @RequestBody UserInfoUpdateRequest userInfoUpdateRequest, BindingResult result, Principal principal){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);

        if (errorMap != null) return errorMap;

        UserInfo userInfo = userInfoService.createUpdateUserInfo(userInfoUpdateRequest, principal.getName());

        return new ResponseEntity<UserInfo>(userInfo, HttpStatus.CREATED);

    }
}
