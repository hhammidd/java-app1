package com.hamidApp1.dao.permissions;

import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.salesPoint.PvTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionsDao extends JpaRepository<Permissions,Integer> {
}
