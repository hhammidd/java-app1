package com.hamidApp1.service.istat.impl;

import com.hamidApp1.dao.istat.IstatItQueryDao;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.service.istat.IstatItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IstatItServiceImpl implements IstatItService {
    @Autowired
    private IstatItQueryDao istatItDao;

    public List<Istat_it> findAll() {
        return istatItDao.findAll();
    }

}
