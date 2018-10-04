package com.hamidApp1.dao.pv;

import com.hamidApp1.model.pv.Pv;

import java.util.List;

public interface PvQueryDao {
    List<Pv> findAll();

    void savePv(Pv pvs);
}
