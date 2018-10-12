package com.hamidApp1.service.istat.impl;

import com.hamidApp1.dao.istat.IstatItQueryDao;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.istat.Istat_it_filter;
import com.hamidApp1.model.usersGis.UsersGis;
import com.hamidApp1.service.istat.IstatItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class IstatItServiceImpl implements IstatItService {
    @Autowired
    private IstatItQueryDao istatItDao;

    public List<Istat_it> findAll() {
        return istatItDao.findAll();
    }

    @Override
    public void savePv(Istat_it pvs) {
        istatItDao.saveIstat(pvs);
    }

    @Override
    public List<Istat_it> findByidRegion(int id_region) {
        return istatItDao.findByidRegion(id_region);
    }

    @Override
    public List<Istat_it> getHistMailList(Istat_it_filter input) {
        return istatItDao.getAllIstatFilter(input);
    }



    @Override
    public void deleteIstat(String id) {
        istatItDao.removeIf(id);
    }


}
