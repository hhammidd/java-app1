package com.hamidApp1.controller.companies;

import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.service.companies.CompaniesService;
import com.hamidApp1.service.companies.impl.CompaniesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompaniesController {
    @Autowired
    private CompaniesService companiesService;

    @GetMapping(value = "/findall")
    public List<Companies> getAllMerchantFraud()  {
        return companiesService.findAll();
    }


}
