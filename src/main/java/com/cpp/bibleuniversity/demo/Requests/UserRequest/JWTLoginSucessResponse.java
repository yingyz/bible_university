package com.cpp.bibleuniversity.demo.Requests.UserRequest;

import com.cpp.bibleuniversity.demo.Models.User;

public class JWTLoginSucessResponse {
    private String token;
    private User user;

    public JWTLoginSucessResponse(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "JWTLoginSucessReponse{" +
                "token='" + token + '\'' +
                '}';
    }
}
