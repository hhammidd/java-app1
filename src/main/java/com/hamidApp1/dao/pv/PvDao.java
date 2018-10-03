package com.hamidApp1.dao.pv;

import com.hamidApp1.model.pv.Pv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PvDao extends JpaRepository<Pv, Integer> {
}
