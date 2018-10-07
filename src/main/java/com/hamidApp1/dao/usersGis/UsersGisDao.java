package com.hamidApp1.dao.usersGis;


import com.hamidApp1.model.usersGis.UsersGis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersGisDao extends JpaRepository<UsersGis, Integer> {

    @Query("SELECT u FROM UsersGis u WHERE u.user_name = :user_name")
    List<UsersGis> findOne(@Param("user_name") String firstName);
}
