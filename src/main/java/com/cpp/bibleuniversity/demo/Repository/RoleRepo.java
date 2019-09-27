package com.cpp.bibleuniversity.demo.Repository;

import com.cpp.bibleuniversity.demo.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findRoleByName(String name);
}
