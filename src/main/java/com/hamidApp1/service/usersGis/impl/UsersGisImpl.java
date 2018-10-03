package com.hamidApp1.service.usersGis.impl;

import com.hamidApp1.dao.usersGis.UsersGisQueryDao;
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
}
