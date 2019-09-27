package com.cpp.bibleuniversity.demo.Repository;

import com.cpp.bibleuniversity.demo.Models.User;
import com.cpp.bibleuniversity.demo.Models.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepo extends CrudRepository<UserInfo, Long> {

    UserInfo findByUser(User user);

}
