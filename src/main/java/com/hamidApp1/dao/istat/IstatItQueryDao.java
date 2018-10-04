package com.hamidApp1.dao.istat;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.usersGis.UsersGis;

import java.util.List;

public interface IstatItQueryDao {
    List<Istat_it> findAll();

    void saveIstat(Istat_it pvs);
}
