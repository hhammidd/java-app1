package com.hamidApp1.service.permissionsService.impl;

import com.hamidApp1.dao.permissions.PermissionsDao;
import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.salesPoint.PvTest;
import com.hamidApp1.model.usersGis.UsersGis;
import com.hamidApp1.service.permissionsService.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionsServiceImpl implements PermissionsService {
    @Autowired
    private PermissionsDao permissionsDao;

    @Override
    public List<Permissions> findAll() {
        return null;
    }

    @Override
    public void savePv(Permissions pvs) {
        permissionsDao.save(pvs);
    }

}
