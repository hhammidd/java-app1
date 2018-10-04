package com.hamidApp1.controller.pv;


import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.pv.Pv;
import com.hamidApp1.service.pv.PvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pv")
public class PvController {

    @Autowired
    private PvService pvService;
    @GetMapping(value = "/findAll")
    public List<Pv> getAllPv()  {
        return pvService.findAll();
    }

    @PostMapping(value = "/load")
    public List<Pv> persist(@RequestBody final Pv pvs) {
        pvService.savePv(pvs);
        return pvService.findAll();
    }
}
