package com.cpp.bibleuniversity.demo.Repository;

import com.cpp.bibleuniversity.demo.Models.StudentAssessment;
import com.cpp.bibleuniversity.demo.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAssessmentRepo extends CrudRepository<StudentAssessment, Long> {

    StudentAssessment findByUser(User user);
}
