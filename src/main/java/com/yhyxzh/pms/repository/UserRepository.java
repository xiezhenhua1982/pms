package com.yhyxzh.pms.repository;

import com.yhyxzh.pms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Query("SELECT count(u) FROM User u WHERE u.username = :username and u.password = :password")
    Long checkUserExists(@Param("username") String username, @Param("password") String password);
}
