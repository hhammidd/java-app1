package com.hamidApp1.controller.companies;

import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.model.entity.Company;
import com.hamidApp1.model.merchantFraud.MerchantFraudToolOutputBean;
import com.hamidApp1.service.companies.CompaniesService;
import com.hamidApp1.service.merchant.MerchantFraudToolService;
import com.hamidApp1.service.util.Constant;
import com.hamidApp1.service.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompaniesController {
    @Autowired
    private CompaniesService companiesService;

    @GetMapping(value = "/findAll")
    public List<Companies> getAllMerchantFraud()  {
        return companiesService.findAll();
    }
}
