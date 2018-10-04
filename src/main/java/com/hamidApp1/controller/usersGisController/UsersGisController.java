package com.hamidApp1.controller.usersGisController;

import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.usersGis.UsersGis;
import com.hamidApp1.service.usersGis.UsersGisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usersgis")
public class UsersGisController {

        @Autowired
        private UsersGisServices usersGisServices;

        @GetMapping(value = "/findall")
        public List<UsersGis> getAll() {
            return usersGisServices.findAll();
        }

        @PostMapping(value = "/load")
        public List<UsersGis> persist(@RequestBody final UsersGis pvs) {
                usersGisServices.savePv(pvs);
                return usersGisServices.findAll();
        }
}

