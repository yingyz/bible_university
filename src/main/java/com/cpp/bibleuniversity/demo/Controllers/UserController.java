package com.cpp.bibleuniversity.demo.Controllers;

import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Requests.UserRequest.JWTLoginSucessResponse;
import com.cpp.bibleuniversity.demo.Requests.UserRequest.LoginRequest;
import com.cpp.bibleuniversity.demo.Requests.UserRequest.SignUpRequest;
import com.cpp.bibleuniversity.demo.Security.JwtTokenProvider;
import com.cpp.bibleuniversity.demo.Services.MapValidationErrorService;
import com.cpp.bibleuniversity.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.cpp.bibleuniversity.demo.Security.SecurityConstants.TOKEN_PREFIX;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) return errorMap;

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = TOKEN_PREFIX +  tokenProvider.generateToken(authentication);
        User user = userService.findUserByName(loginRequest.getUsername());

        return ResponseEntity.ok(new JWTLoginSucessResponse(jwt, user));
    }



    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest, BindingResult result) {
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null)return errorMap;

        User user = userService.saveUser(signUpRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }


}
