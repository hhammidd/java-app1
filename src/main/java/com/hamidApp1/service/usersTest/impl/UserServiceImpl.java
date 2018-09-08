package com.hamidApp1.service.usersTest.impl;

import com.hamidApp1.dao.usersTests.UserDao;
import com.hamidApp1.model.users.User;
import com.hamidApp1.service.usersTest.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(long id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        return userDao.findByFirstName(firstName);
    }
}
