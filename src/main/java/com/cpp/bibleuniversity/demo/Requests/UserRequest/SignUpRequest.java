package com.cpp.bibleuniversity.demo.Requests.UserRequest;

import javax.validation.constraints.NotBlank;

public class SignUpRequest {
    @NotBlank(message = "请填写您的电子邮箱")
    private String username;

    @NotBlank(message = "请填写您的密码")
    private String password;

    @NotBlank(message = "请填写您的英文名")
    private String firstname;

    @NotBlank(message = "请填写您的英文姓")
    private String lastname;

    @NotBlank(message = "请填写您的中文姓名")
    private String chinesename;

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getChinesename() {
        return chinesename;
    }

    public void setChinesename(String chinesename) {
        this.chinesename = chinesename;
    }
}
