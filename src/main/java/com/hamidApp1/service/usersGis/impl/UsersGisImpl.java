package com.hamidApp1.service.usersGis.impl;

import com.hamidApp1.dao.usersGis.UsersGisQueryDao;
import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.usersGis.*;
import com.hamidApp1.service.usersGis.UsersGisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersGisImpl implements UsersGisServices {

    @Autowired
    private UsersGisQueryDao usersGisQueryDao;

    @Override
    public List<UsersGis> findAll() {
        return usersGisQueryDao.findAll();
    }

    @Override
    public void savePv(UsersGis pvs) {
         usersGisQueryDao.saveUser(pvs);
    }

    @Override
    public UsersGis findById(int id_user) {
        return usersGisQueryDao.findById(id_user);
    }

    @Override
    public List<UsersGis> findByFirstName(String user_name) {
        return usersGisQueryDao.findByUserName(user_name);
    }

    @Override
    public UserInfo findUsersInfo(UserInput user) {
        UserInfo userInfos= usersGisQueryDao.findUsersInfo(user);

        if (userInfos != null) {
            List<UserPermissions> userPermissions = usersGisQueryDao.findUsersPermit(userInfos);
            System.out.println(userPermissions);

            for (UserPermissions u : userPermissions){
                System.out.println("ff: " + u.getId_permission());
            }
        }
        return  userInfos;
    }

    @Override
    public List<UserPermissions> findUsersPermission(UserInput usergis) {

        // you send the user and pass you take the result
        UserInfo userInfos= usersGisQueryDao.findUsersInfo(usergis);

        // do the check

        List<UserPermissions> userPermissions = usersGisQueryDao.findUsersPermit(userInfos);

        UserPermit objSection = new UserPermit();

        return userPermissions;
    }

    @Override
    public UserLists findUserInfo(UserInput usergis) {
        UserLists userTotInfoObj = new UserLists();

        UserPermitList userObj = null;
        ArrayList<UserPermitList> userPermitLists = new ArrayList<UserPermitList>();

        UserInfo userInfos= usersGisQueryDao.findUsersInfo(usergis);

        List<UserPermissions> userPermissions = usersGisQueryDao.findUsersPermit(userInfos);
        //

        for (UserPermissions up : userPermissions){
            userObj = new UserPermitList();
            userObj.setId_permission(up.getId_permission());
            userObj.setName(up.getName());
            userPermitLists.add(userObj);
        }
        //userPermitLists.add(userObj);

        userTotInfoObj.setAdministrator(userInfos.getAdministrator());
        userTotInfoObj.setId_company(userInfos.getId_company());
        userTotInfoObj.setId_company_mGis(userInfos.getId_company());
        userTotInfoObj.setId_user(userInfos.getId_user());
        userTotInfoObj.setPassword(userInfos.getPassword());
        userTotInfoObj.setUserPermitLists(userPermitLists);
        // Take the permits in the UserPermitList
        return userTotInfoObj;
    }
}
