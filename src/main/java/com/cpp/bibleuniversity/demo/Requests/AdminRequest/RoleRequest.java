package com.cpp.bibleuniversity.demo.Requests.AdminRequest;


import javax.validation.constraints.NotBlank;

public class RoleRequest {

    @NotBlank(message = "Role name is required")
    private String name;

    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
