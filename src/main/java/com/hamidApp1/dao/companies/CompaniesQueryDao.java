package com.hamidApp1.dao.companies;

import com.hamidApp1.model.companies.Companies;

import java.util.List;

public interface CompaniesQueryDao {
    List<Companies> findAll();
}
