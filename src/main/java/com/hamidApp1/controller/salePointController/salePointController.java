package com.hamidApp1.controller.salePointController;

import com.hamidApp1.model.salesPoint.PvTest;
import com.hamidApp1.service.salePoint.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salepoint")
public class salePointController {

    @Autowired
    private SalePointService salePointService;

    @GetMapping(value = "/findAllSailPoint")
    public List<PvTest> getAll() {
        return salePointService.findAll();
    }

    @RequestMapping(value = "/salePointDetail/{pv_id}", method = RequestMethod.GET)
    public PvTest findOne(@PathVariable int pv_id) {
        return salePointService.findById(pv_id);
    }

    @GetMapping(value = "/istat_id/{pv_id}")
    public List<PvTest> findIstat(@PathVariable int pv_id) {
        return salePointService.findIstat(pv_id);
    }

    @PostMapping(value = "/load")
    public List<PvTest> persist(@RequestBody final PvTest pvs) {
        salePointService.savePv(pvs);
        return salePointService.findAll();
    }
}
