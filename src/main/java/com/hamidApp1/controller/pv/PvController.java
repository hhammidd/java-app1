package com.hamidApp1.controller.pv;


import com.hamidApp1.model.pv.PvRegComFilter;
import com.hamidApp1.model.pv.Pv;
import com.hamidApp1.service.pv.PvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.ArrayList;
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

    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public List<Pv> getHistMailList(
            @RequestBody @Valid PvRegComFilter input) throws SQLException {
        List<Pv> p = new ArrayList<>();
        p = pvService.getPvRegCom(input);
        System.out.println("hey: " + p.get(0).getAddress());
        return p;
    }
}
