package com.hamidApp1.dao.usersGis;

import com.hamidApp1.model.usersGis.*;

import java.util.List;

public interface UsersGisQueryDao {
    List<UsersGis> findAll();

    void saveUser(UsersGis pvs);

    UsersGis findById(int id_user);

    List<UsersGis> findByUserName(String user_name);

    UserInfo findUsersInfo(UserInput user);


    List<UserPermissions> findUsersPermit(UserInfo up);

}
