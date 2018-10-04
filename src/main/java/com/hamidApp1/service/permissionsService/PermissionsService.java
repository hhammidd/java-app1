package com.hamidApp1.service.permissionsService;

import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.salesPoint.PvTest;
import com.hamidApp1.model.usersGis.UsersGis;

import java.util.List;

public interface PermissionsService {
    List<Permissions> findAll();
    void savePv(Permissions pvs);
}
