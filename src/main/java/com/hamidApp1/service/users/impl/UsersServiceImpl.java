package com.hamidApp1.service.users.impl;

import com.hamidApp1.dao.users.UsersJpaDao;
import com.hamidApp1.model.authentication.Frmhuser;

import com.hamidApp1.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersJpaDao usersQueryDao;
    @Override
    public List<Frmhuser> findByUserCod(String userCode) {
        return null;
    }
}
