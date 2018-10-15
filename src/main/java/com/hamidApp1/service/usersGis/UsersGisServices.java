package com.hamidApp1.service.usersGis;

import com.hamidApp1.model.usersGis.*;

import java.util.List;

public interface UsersGisServices {
    List<UsersGis> findAll();

    void savePv(UsersGis pvs);

    UsersGis findById(int id_user);

    List<UsersGis> findByFirstName(String user_name);

    UserInfo findUsersInfo(UserInput user);

    List<UserPermissions> findUsersPermission(UserInput usergis);
    UserLists findUserInfo(UserInput usergis);

    // this will take user_name and take back other data
    UsersGis findUsersByCod(String usergis);
}
