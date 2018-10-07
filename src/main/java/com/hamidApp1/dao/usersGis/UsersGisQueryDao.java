package com.hamidApp1.dao.usersGis;

import com.hamidApp1.model.usersGis.UsersGis;

import java.util.List;

public interface UsersGisQueryDao {
    List<UsersGis> findAll();

    void saveUser(UsersGis pvs);

    UsersGis findById(int id_user);

    List<UsersGis> findByUserName(String user_name);
}
