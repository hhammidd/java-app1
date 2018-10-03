package com.hamidApp1.service.salePoint;

import com.hamidApp1.model.salesPoint.PvTest;

import java.util.List;

public interface SalePointService {
    public List<PvTest> findAll();
    public PvTest findById(int pv_id);
    public List<PvTest> findByFirstName(String name1);

    public List<PvTest> findIstat(int pv_id);

    void savePv(PvTest pvs);
}
