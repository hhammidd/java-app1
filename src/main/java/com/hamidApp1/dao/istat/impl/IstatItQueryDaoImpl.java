package com.hamidApp1.dao.istat.impl;

import com.hamidApp1.dao.istat.IstatItDao;
import com.hamidApp1.dao.istat.IstatItQueryDao;
import com.hamidApp1.dao.permissions.PermissionsDao;
import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.usersGis.UsersGis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IstatItQueryDaoImpl implements IstatItQueryDao {
    @Autowired
    private IstatItDao istatItDao;

    @Override
    public List<Istat_it> findAll() {
        return istatItDao.findAll();
    }

    @Override
    public void saveIstat(Istat_it pvs) {
        istatItDao.save(pvs);
    }
}
