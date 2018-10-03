package com.hamidApp1.dao.companies;

import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.model.entity.Company;

import java.util.List;

public interface CompaniesDao {
    List<Companies> findAll();
}
