package com.hamidApp1.service.usersGis.impl;

import com.hamidApp1.dao.usersGis.UsersGisQueryDao;
import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.usersGis.UsersGis;
import com.hamidApp1.service.usersGis.UsersGisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
