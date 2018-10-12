package com.hamidApp1.service.companies.impl;

import com.hamidApp1.dao.companies.CompaniesQueryDao;
import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.service.companies.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesServiceImpl implements CompaniesService {
    @Autowired
    private CompaniesQueryDao companiesDao;

    @Override
    public List<Companies> findAll() {
        return companiesDao.findAll();
    }



}
