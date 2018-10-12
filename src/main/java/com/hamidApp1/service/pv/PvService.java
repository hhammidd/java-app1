package com.hamidApp1.service.pv;

import com.hamidApp1.model.pv.PvRegComFilter;
import com.hamidApp1.model.pv.Pv;

import java.util.List;


public interface PvService {
    List<Pv> findAll();
    void savePv(Pv pvs);

    List<Pv> getPvRegCom(PvRegComFilter input);
}
