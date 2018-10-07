package com.hamidApp1.dao.usersGis.impl;

import com.hamidApp1.dao.usersGis.UsersGisDao;
import com.hamidApp1.dao.usersGis.UsersGisQueryDao;
import com.hamidApp1.model.usersGis.UsersGis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersGisQueryDaoImpl implements UsersGisQueryDao {

    @Autowired
    private UsersGisDao usersGisDao;

    @Override
    public List<UsersGis> findAll() {
        return usersGisDao.findAll();
    }

    @Override
    public void saveUser(UsersGis pvs) {
         usersGisDao.save(pvs);
    }

    @Override
    public UsersGis findById(int id_user) {
        return usersGisDao.findOne(id_user);
    }

    @Override
    public List<UsersGis> findByUserName(String user_name) {
        return usersGisDao.findOne(user_name);
    }
}
