package com.hamidApp1.service.salePoint.impl;


import com.hamidApp1.dao.SalePointDao;
import com.hamidApp1.model.salesPoint.Pv;
import com.hamidApp1.service.salePoint.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalePointServiceImp implements SalePointService {

    @Autowired
    private SalePointDao salePointDao;

    @Override
    public List<Pv> findAll() {
        return salePointDao.findAll();
    }

    @Override
    public Pv findById(int pv_id) {
        return salePointDao.findOne(pv_id);
    }

    @Override
    public List<Pv> findByFirstName(String name1) {
        return salePointDao.findByFirstName(name1);
    }

    @Override
    public List<Pv> findIstat(int pv_id) {
        return salePointDao.findIstatByPv_id(pv_id);
    }
}
