package com.hamidApp1.dao.istat;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.istat.Istat_it_filter;

import java.util.List;

public interface IstatItQueryDao {
    List<Istat_it> findAll();

    void saveIstat(Istat_it pvs);

    List<Istat_it> findByidRegion(int id_region);

    List<Istat_it> getAllIstatFilter(Istat_it_filter input);

    void removeIf(String id);
}
