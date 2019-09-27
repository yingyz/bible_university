package com.cpp.bibleuniversity.demo.Controllers;

import com.cpp.bibleuniversity.demo.Models.StudentAssessment;
import com.cpp.bibleuniversity.demo.Requests.StudentAssessmentRequest.StudentAssessmentUpdateRequest;
import com.cpp.bibleuniversity.demo.Services.MapValidationErrorService;
import com.cpp.bibleuniversity.demo.Services.StudentAssessmentService;
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
@RequestMapping("/api/assessment")
public class StudentAssessmentController {

    @Autowired
    MapValidationErrorService mapValidationErrorService;

    @Autowired
    StudentAssessmentService studentAssessmentService;

    @PostMapping()
    public ResponseEntity<?> createOrUpdateStudentAssessment(@Valid @RequestBody StudentAssessmentUpdateRequest studentAssessmentUpdateRequest, BindingResult result, Principal principal){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null) return errorMap;

        StudentAssessment studentAssessment = studentAssessmentService.createOrUpdateStudentAssessment(studentAssessmentUpdateRequest, principal.getName());

        return new ResponseEntity<StudentAssessment>(studentAssessment, HttpStatus.CREATED);
    }
}
