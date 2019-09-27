package com.cpp.bibleuniversity.demo.Requests.UserRequest;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message = "请填写您的用户名")
    private String username;
    @NotBlank(message = "请填写您的密码")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
