package com.hamidApp1.dao;

import com.hamidApp1.model.salesPoint.PvTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalePointDao extends JpaRepository<PvTest,Integer> {

    @Query("SELECT p FROM PvTest p WHERE p.name1 = :name1")
    public List<PvTest> findByFirstName(@Param("name1") String name1);

    @Query("SELECT p FROM PvTest p WHERE p.pv_id = :pv_id")
    public List<PvTest> findIstatByPv_id(@Param("pv_id") Integer pv_id);
}
