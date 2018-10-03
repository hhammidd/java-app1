package com.hamidApp1.dao.pv.impl;

import com.hamidApp1.dao.pv.PvDao;
import com.hamidApp1.dao.pv.PvQueryDao;
import com.hamidApp1.model.pv.Pv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PvQueryDaoImpl implements PvQueryDao {

    @Autowired
    private PvDao pvDao;
    @Override
    public List<Pv> findAll() {
        return pvDao.findAll();
    }
}
