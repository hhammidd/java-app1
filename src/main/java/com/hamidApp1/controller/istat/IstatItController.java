package com.hamidApp1.controller.istat;

import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.salesPoint.PvTest;
import com.hamidApp1.service.companies.CompaniesService;
import com.hamidApp1.service.istat.IstatItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/istatit")
public class IstatItController {
    @Autowired
    private IstatItService istatItService;

    @GetMapping(value = "/findAll")
    public List<Istat_it> getAllMerchantFraud()  {
        return istatItService.findAll();
    }


}
