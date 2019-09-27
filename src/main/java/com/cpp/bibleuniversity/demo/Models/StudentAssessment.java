package com.cpp.bibleuniversity.demo.Models;

import javax.persistence.*;

@Entity
public class StudentAssessment {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String highestgrade;
    private String highestgradecountry;
    private String otheruniversityattended;
    private String degreeearned;
    private String favoritelanguage;
    private String churchattended;
    private String churchattendedaddress;
    private String churchattendedcity;
    private String churchattendedstate;
    private String churchattendedzip;
    private String churchattendedpastorname;
    private String churchattendedservingposition;
    private String churchattendedphone;
    private String employername;
    private String employerphone;
    private String employeraddress;
    private String employercity;
    private String employerstate;
    private String employerzip;
    private String maritalstatus;
    private String spousename;
    private String emergencycontactname;
    private String emergencycontactphone;
    private String emergencycontactaddress;
    private String emergencycontactcity;
    private String emergencycontactstate;
    private String emergencycontactzip;
    private String informationfirsthearbibleuniversity;
    private String informationreasonchooseuniversity;
    private String informationhowbecomechristian;
    private String lifegoal;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;

    public StudentAssessment(){}

    public StudentAssessment(String highestgrade, String highestgradecountry, String otheruniversityattended, String degreeearned, String favoritelanguage, String churchattended, String churchattendedaddress, String churchattendedcity, String churchattendedstate, String churchattendedzip, String churchattendedpastorname, String churchattendedservingposition, String churchattendedphone, String employername, String employerphone, String employeraddress, String employercity, String employerstate, String employerzip, String maritalstatus, String spousename, String emergencycontactname, String emergencycontactphone, String emergencycontactaddress, String emergencycontactcity, String emergencycontactstate, String emergencycontactzip, String informationfirsthearbibleuniversity, String informationreasonchooseuniversity, String informationhowbecomechristian, String lifegoal) {
        this.highestgrade = highestgrade;
        this.highestgradecountry = highestgradecountry;
        this.otheruniversityattended = otheruniversityattended;
        this.degreeearned = degreeearned;
        this.favoritelanguage = favoritelanguage;
        this.churchattended = churchattended;
        this.churchattendedaddress = churchattendedaddress;
        this.churchattendedcity = churchattendedcity;
        this.churchattendedstate = churchattendedstate;
        this.churchattendedzip = churchattendedzip;
        this.churchattendedpastorname = churchattendedpastorname;
        this.churchattendedservingposition = churchattendedservingposition;
        this.churchattendedphone = churchattendedphone;
        this.employername = employername;
        this.employerphone = employerphone;
        this.employeraddress = employeraddress;
        this.employercity = employercity;
        this.employerstate = employerstate;
        this.employerzip = employerzip;
        this.maritalstatus = maritalstatus;
        this.spousename = spousename;
        this.emergencycontactname = emergencycontactname;
        this.emergencycontactphone = emergencycontactphone;
        this.emergencycontactaddress = emergencycontactaddress;
        this.emergencycontactcity = emergencycontactcity;
        this.emergencycontactstate = emergencycontactstate;
        this.emergencycontactzip = emergencycontactzip;
        this.informationfirsthearbibleuniversity = informationfirsthearbibleuniversity;
        this.informationreasonchooseuniversity = informationreasonchooseuniversity;
        this.informationhowbecomechristian = informationhowbecomechristian;
        this.lifegoal = lifegoal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHighestgrade() {
        return highestgrade;
    }

    public void setHighestgrade(String highestgrade) {
        this.highestgrade = highestgrade;
    }

    public String getHighestgradecountry() {
        return highestgradecountry;
    }

    public void setHighestgradecountry(String highestgradecountry) {
        this.highestgradecountry = highestgradecountry;
    }

    public String getOtheruniversityattended() {
        return otheruniversityattended;
    }

    public void setOtheruniversityattended(String otheruniversityattended) {
        this.otheruniversityattended = otheruniversityattended;
    }

    public String getDegreeearned() {
        return degreeearned;
    }

    public void setDegreeearned(String degreeearned) {
        this.degreeearned = degreeearned;
    }

    public String getFavoritelanguage() {
        return favoritelanguage;
    }

    public void setFavoritelanguage(String favoritelanguage) {
        this.favoritelanguage = favoritelanguage;
    }

    public String getChurchattended() {
        return churchattended;
    }

    public void setChurchattended(String churchattended) {
        this.churchattended = churchattended;
    }

    public String getChurchattendedaddress() {
        return churchattendedaddress;
    }

    public void setChurchattendedaddress(String churchattendedaddress) {
        this.churchattendedaddress = churchattendedaddress;
    }

    public String getChurchattendedcity() {
        return churchattendedcity;
    }

    public void setChurchattendedcity(String churchattendedcity) {
        this.churchattendedcity = churchattendedcity;
    }

    public String getChurchattendedstate() {
        return churchattendedstate;
    }

    public void setChurchattendedstate(String churchattendedstate) {
        this.churchattendedstate = churchattendedstate;
    }

    public String getChurchattendedzip() {
        return churchattendedzip;
    }

    public void setChurchattendedzip(String churchattendedzip) {
        this.churchattendedzip = churchattendedzip;
    }

    public String getChurchattendedpastorname() {
        return churchattendedpastorname;
    }

    public void setChurchattendedpastorname(String churchattendedpastorname) {
        this.churchattendedpastorname = churchattendedpastorname;
    }

    public String getChurchattendedservingposition() {
        return churchattendedservingposition;
    }

    public void setChurchattendedservingposition(String churchattendedservingposition) {
        this.churchattendedservingposition = churchattendedservingposition;
    }

    public String getChurchattendedphone() {
        return churchattendedphone;
    }

    public void setChurchattendedphone(String churchattendedphone) {
        this.churchattendedphone = churchattendedphone;
    }

    public String getEmployername() {
        return employername;
    }

    public void setEmployername(String employername) {
        this.employername = employername;
    }

    public String getEmployerphone() {
        return employerphone;
    }

    public void setEmployerphone(String employerphone) {
        this.employerphone = employerphone;
    }

    public String getEmployeraddress() {
        return employeraddress;
    }

    public void setEmployeraddress(String employeraddress) {
        this.employeraddress = employeraddress;
    }

    public String getEmployercity() {
        return employercity;
    }

    public void setEmployercity(String employercity) {
        this.employercity = employercity;
    }

    public String getEmployerstate() {
        return employerstate;
    }

    public void setEmployerstate(String employerstate) {
        this.employerstate = employerstate;
    }

    public String getEmployerzip() {
        return employerzip;
    }

    public void setEmployerzip(String employerzip) {
        this.employerzip = employerzip;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getSpousename() {
        return spousename;
    }

    public void setSpousename(String spousename) {
        this.spousename = spousename;
    }

    public String getEmergencycontactname() {
        return emergencycontactname;
    }

    public void setEmergencycontactname(String emergencycontactname) {
        this.emergencycontactname = emergencycontactname;
    }

    public String getEmergencycontactphone() {
        return emergencycontactphone;
    }

    public void setEmergencycontactphone(String emergencycontactphone) {
        this.emergencycontactphone = emergencycontactphone;
    }

    public String getEmergencycontactaddress() {
        return emergencycontactaddress;
    }

    public void setEmergencycontactaddress(String emergencycontactaddress) {
        this.emergencycontactaddress = emergencycontactaddress;
    }

    public String getEmergencycontactcity() {
        return emergencycontactcity;
    }

    public void setEmergencycontactcity(String emergencycontactcity) {
        this.emergencycontactcity = emergencycontactcity;
    }

    public String getEmergencycontactstate() {
        return emergencycontactstate;
    }

    public void setEmergencycontactstate(String emergencycontactstate) {
        this.emergencycontactstate = emergencycontactstate;
    }

    public String getEmergencycontactzip() {
        return emergencycontactzip;
    }

    public void setEmergencycontactzip(String emergencycontactzip) {
        this.emergencycontactzip = emergencycontactzip;
    }

    public String getInformationfirsthearbibleuniversity() {
        return informationfirsthearbibleuniversity;
    }

    public void setInformationfirsthearbibleuniversity(String informationfirsthearbibleuniversity) {
        this.informationfirsthearbibleuniversity = informationfirsthearbibleuniversity;
    }

    public String getInformationreasonchooseuniversity() {
        return informationreasonchooseuniversity;
    }

    public void setInformationreasonchooseuniversity(String informationreasonchooseuniversity) {
        this.informationreasonchooseuniversity = informationreasonchooseuniversity;
    }

    public String getInformationhowbecomechristian() {
        return informationhowbecomechristian;
    }

    public void setInformationhowbecomechristian(String informationhowbecomechristian) {
        this.informationhowbecomechristian = informationhowbecomechristian;
    }

    public String getLifegoal() {
        return lifegoal;
    }

    public void setLifegoal(String lifegoal) {
        this.lifegoal = lifegoal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}