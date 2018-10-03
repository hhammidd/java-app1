package com.hamidApp1.service.pv.impl;

import com.hamidApp1.dao.pv.PvQueryDao;
import com.hamidApp1.model.pv.Pv;
import com.hamidApp1.service.pv.PvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PvServiceImpl implements PvService {
    @Autowired
    private PvQueryDao pvQueryDao;
    @Override
    public List<Pv> findAll() {
        return pvQueryDao.findAll();
    }
}
