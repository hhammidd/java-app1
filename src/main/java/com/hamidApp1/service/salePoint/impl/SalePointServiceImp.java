package com.hamidApp1.service.salePoint.impl;


import com.hamidApp1.dao.salePoint.SalePointDao;
import com.hamidApp1.model.salesPoint.PvTest;
import com.hamidApp1.service.salePoint.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalePointServiceImp implements SalePointService {

    @Autowired
    private SalePointDao salePointDao;

    @Override
    public List<PvTest> findAll() {
        return salePointDao.findAll();
    }

    @Override
    public PvTest findById(int pv_id) {
        return salePointDao.findOne(pv_id);
    }

    @Override
    public List<PvTest> findByFirstName(String name1) {
        return salePointDao.findByFirstName(name1);
    }

    @Override
    public List<PvTest> findIstat(int pv_id) {
        return salePointDao.findIstatByPv_id(pv_id);
    }

    @Override
    public void savePv(PvTest pvs) {
        salePointDao.save(pvs);
    }
}
