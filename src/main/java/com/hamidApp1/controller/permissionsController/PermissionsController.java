package com.hamidApp1.controller.permissionsController;

import com.hamidApp1.model.companies.Companies;
import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.salesPoint.PvTest;
import com.hamidApp1.service.permissionsService.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {
    @Autowired
    private PermissionsService permissionsService;

    @GetMapping(value = "/findAll")
    public List<Permissions> getAllPermissions()  {
        return permissionsService.findAll();
    }

}
