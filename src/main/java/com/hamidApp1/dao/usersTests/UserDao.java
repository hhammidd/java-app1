package com.hamidApp1.dao.usersTests;

import com.hamidApp1.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.firstName = :firstName")
    public List<User> findByFirstName(@Param("firstName") String firstName);
}
