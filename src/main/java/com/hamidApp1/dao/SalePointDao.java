package com.hamidApp1.dao;

import com.hamidApp1.model.salesPoint.Pv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalePointDao extends JpaRepository<Pv,Integer> {
    @Query("SELECT p FROM Pv p WHERE p.name1 = :name1")
    public List<Pv> findByFirstName(@Param("name1") String name1);

    @Query("SELECT p FROM Pv p WHERE p.pv_id = :pv_id")
    public List<Pv> findIstatByPv_id(@Param("pv_id") Integer pv_id);
}
