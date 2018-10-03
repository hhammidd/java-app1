package com.hamidApp1.service.companies;

import com.hamidApp1.dao.companies.CompaniesDao;
import com.hamidApp1.dao.merchant.MerchantFraudToolBigDao;
import com.hamidApp1.model.common.ServiceOperationBean;
import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.model.entity.Company;
import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import com.hamidApp1.model.merchantFraud.MerchantFraudToolOutputBean;
import com.hamidApp1.service.util.Message;
import com.hamidApp1.service.util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesService {
    @Autowired
    private CompaniesDao companiesDao;

    public List<Companies> findAll() {
        return companiesDao.findAll();
    }
}
