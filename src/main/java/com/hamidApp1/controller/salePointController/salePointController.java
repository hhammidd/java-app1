package com.hamidApp1.controller.salePointController;

import com.hamidApp1.model.salesPoint.Pv;
import com.hamidApp1.service.salePoint.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class salePointController {

    @Autowired
    private SalePointService salePointService;


    @GetMapping(value = "/findAll1")
    public List<Pv> getAll() {
        return salePointService.findAll();
    }

    @RequestMapping(value = "/salePointDetail/{pv_id}", method = RequestMethod.GET)
    public Pv findOne(@PathVariable int pv_id) {
        return salePointService.findById(pv_id);
    }

    @GetMapping(value = "/istat_id/{pv_id}")
    public List<Pv> findIstat(@PathVariable int pv_id) {
        return salePointService.findIstat(pv_id);
    }
}
