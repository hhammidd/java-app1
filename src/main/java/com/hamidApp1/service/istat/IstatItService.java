package com.hamidApp1.service.istat;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.istat.Istat_it_filter;
import com.hamidApp1.model.usersGis.UsersGis;

import java.util.List;

public interface IstatItService {
    List<Istat_it> findAll();

    void savePv(Istat_it pvs);

    List<Istat_it> findByidRegion(int id_region);

    List<Istat_it> getHistMailList(Istat_it_filter input);


    void deleteIstat(String id);
}
