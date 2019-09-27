package com.cpp.bibleuniversity.demo.Requests.UserInfoRequest;

import javax.validation.constraints.NotBlank;

public class UserInfoUpdateRequest {

    @NotBlank(message="请填写您的居住街道")
    private String street;

    @NotBlank(message="请填写您的居住城市")
    private String city;

    @NotBlank(message="请填写您的居住省份")
    private String state;

    @NotBlank(message="请填写邮政编码")
    private String zipcode;

    @NotBlank(message = "请填写常用语言")
    private String language;

    @NotBlank(message="请填写您的方言")
    private String dialect;

    @NotBlank(message="请选择您的性别")
    private String gender;

    @NotBlank(message="请填写您的电话号码")
    private String phone;

    @NotBlank(message="请填写您的出生日期")
    private String birthday;

    @NotBlank(message="请填写您的出生城市")
    private String birthcity;

    @NotBlank(message="请填写您的出生国家")
    private String birthnation;

    @NotBlank(message="请填写您的年龄")
    private String age;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthcity() {
        return birthcity;
    }

    public void setBirthcity(String birthcity) {
        this.birthcity = birthcity;
    }

    public String getBirthnation() {
        return birthnation;
    }

    public void setBirthnation(String birthnation) {
        this.birthnation = birthnation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
