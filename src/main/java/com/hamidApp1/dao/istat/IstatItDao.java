package com.hamidApp1.dao.istat;

import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IstatItDao extends JpaRepository<Istat_it, Integer> {

    @Query("SELECT u FROM Istat_it u WHERE u.id_region = :id_region")
    List<Istat_it> findOne(@Param("id_region")int id_region);
}
