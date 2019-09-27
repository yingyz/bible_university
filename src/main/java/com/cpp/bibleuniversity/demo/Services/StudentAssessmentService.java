package com.cpp.bibleuniversity.demo.Services;

import com.cpp.bibleuniversity.demo.Models.StudentAssessment;
import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Repository.StudentAssessmentRepo;
import com.cpp.bibleuniversity.demo.Repository.UserRepo;
import com.cpp.bibleuniversity.demo.Requests.StudentAssessmentRequest.StudentAssessmentUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentAssessmentService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    StudentAssessmentRepo studentAssessmentRepo;

    public StudentAssessment createOrUpdateStudentAssessment(StudentAssessmentUpdateRequest studentAssessmentUpdateRequest, String name){

        User user = userRepo.findByUsername(name);
        StudentAssessment studentAssessment = user.getStudentAssessment();
        if (studentAssessment == null){
            studentAssessment = new StudentAssessment();
            studentAssessment.setUser(user);
        }
        studentAssessment.setHighestgrade(studentAssessmentUpdateRequest.getHighestgrade());
        studentAssessment.setHighestgradecountry(studentAssessmentUpdateRequest.getHighestgradecountry());
        studentAssessment.setOtheruniversityattended(studentAssessmentUpdateRequest.getOtheruniversityattended());
        studentAssessment.setDegreeearned(studentAssessmentUpdateRequest.getDegreeearned());
        studentAssessment.setFavoritelanguage(studentAssessmentUpdateRequest.getFavoritelanguage());
        studentAssessment.setChurchattended(studentAssessmentUpdateRequest.getChurchattended());
        studentAssessment.setChurchattendedaddress(studentAssessmentUpdateRequest.getChurchattendedaddress());
        studentAssessment.setChurchattendedcity(studentAssessmentUpdateRequest.getChurchattendedcity());
        studentAssessment.setChurchattendedstate(studentAssessmentUpdateRequest.getChurchattendedstate());
        studentAssessment.setChurchattendedzip(studentAssessmentUpdateRequest.getChurchattendedzip());
        studentAssessment.setChurchattendedpastorname(studentAssessmentUpdateRequest.getChurchattendedpastorname());
        studentAssessment.setChurchattendedservingposition(studentAssessmentUpdateRequest.getChurchattendedservingposition());
        studentAssessment.setChurchattendedphone(studentAssessmentUpdateRequest.getChurchattendedphone());
        studentAssessment.setEmployername(studentAssessmentUpdateRequest.getEmployername());
        studentAssessment.setEmployerphone(studentAssessmentUpdateRequest.getEmployerphone());
        studentAssessment.setEmployeraddress(studentAssessmentUpdateRequest.getEmployeraddress());
        studentAssessment.setEmployercity(studentAssessmentUpdateRequest.getEmployercity());
        studentAssessment.setEmployerstate(studentAssessmentUpdateRequest.getEmployerstate());
        studentAssessment.setEmployerzip(studentAssessmentUpdateRequest.getEmployerzip());
        studentAssessment.setMaritalstatus(studentAssessmentUpdateRequest.getMaritalstatus());
        studentAssessment.setSpousename(studentAssessmentUpdateRequest.getSpousename());
        studentAssessment.setEmergencycontactname(studentAssessmentUpdateRequest.getEmergencycontactname());
        studentAssessment.setEmergencycontactphone(studentAssessmentUpdateRequest.getEmergencycontactphone());
        studentAssessment.setEmergencycontactaddress(studentAssessmentUpdateRequest.getEmergencycontactaddress());
        studentAssessment.setEmergencycontactcity(studentAssessmentUpdateRequest.getEmergencycontactcity());
        studentAssessment.setEmergencycontactstate(studentAssessmentUpdateRequest.getEmergencycontactstate());
        studentAssessment.setEmergencycontactzip(studentAssessmentUpdateRequest.getEmergencycontactzip());
        studentAssessment.setInformationfirsthearbibleuniversity(studentAssessmentUpdateRequest.getInformationfirsthearbibleuniversity());
        studentAssessment.setInformationreasonchooseuniversity(studentAssessmentUpdateRequest.getInformationreasonchooseuniversity());
        studentAssessment.setInformationhowbecomechristian(studentAssessmentUpdateRequest.getInformationhowbecomechristian());
        studentAssessment.setLifegoal(studentAssessmentUpdateRequest.getLifegoal());

        return studentAssessmentRepo.save(studentAssessment);

    }
}
