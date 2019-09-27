package com.cpp.bibleuniversity.demo.Controllers;

import com.cpp.bibleuniversity.demo.Models.Role;
import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Repository.UserRepo;
import com.cpp.bibleuniversity.demo.Requests.AdminRequest.RoleRequest;
import com.cpp.bibleuniversity.demo.Services.MapValidationErrorService;
import com.cpp.bibleuniversity.demo.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    MapValidationErrorService mapValidationErrorService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/role")
    public ResponseEntity<?> createRole(@Valid @RequestBody RoleRequest roleRequest, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService((result));
        if (errorMap != null) return errorMap;

        Role role = roleService.createRole(roleRequest);

        return new ResponseEntity<Role>(role, HttpStatus.CREATED);

    }

    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userRepo.findAll();
    }

    @PutMapping("/role")
    public ResponseEntity<?> addRoleToExistingUser(@Valid @RequestBody RoleRequest roleRequest, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null) return errorMap;


        return new ResponseEntity<User>(roleService.addRoleToExistingUser(roleRequest), HttpStatus.OK);

    }



}
