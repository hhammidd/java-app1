package com.hamidApp1.service.salePoint;

import com.hamidApp1.model.salesPoint.Pv;

import java.util.List;

public interface SalePointService {
    public List<Pv> findAll();
    public Pv findById(int pv_id);
    public List<Pv> findByFirstName(String name1);

    public List<Pv> findIstat(int pv_id);
}
