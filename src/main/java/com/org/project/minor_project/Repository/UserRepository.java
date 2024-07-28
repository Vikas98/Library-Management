package com.org.project.minor_project.Repository;

import com.org.project.minor_project.Model.User;
import com.org.project.minor_project.Model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    @Query(value = "select * from user where :query", nativeQuery = true)
    List<User> findUsersByNativeQuery(@Param("query") String q);

    User findByPhoneNoAndUserType(String phoneNo, UserType type);
    User findByEmail(String email);
}
