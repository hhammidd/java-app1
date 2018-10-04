package com.hamidApp1.service.istat;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.usersGis.UsersGis;

import java.util.List;

public interface IstatItService {
    List<Istat_it> findAll();

    void savePv(Istat_it pvs);
}
