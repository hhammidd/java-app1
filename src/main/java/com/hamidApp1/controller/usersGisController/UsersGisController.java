package com.hamidApp1.controller.usersGisController;

import com.hamidApp1.model.merchantFraud.MerchantFraudToolOutputBean;
import com.hamidApp1.model.permissions.Permissions;
import com.hamidApp1.model.pv.Pv;
import com.hamidApp1.model.pv.PvRegComFilter;
import com.hamidApp1.model.users.User;
import com.hamidApp1.model.usersGis.UserInfo;
import com.hamidApp1.model.usersGis.UserInput;
import com.hamidApp1.model.usersGis.UserPermissions;
import com.hamidApp1.model.usersGis.UsersGis;
import com.hamidApp1.service.usersGis.UsersGisServices;
import com.hamidApp1.service.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        @RequestMapping(value = "user/{id_user}", method = RequestMethod.GET)
        public UsersGis findOne(@PathVariable int id_user) {
                return usersGisServices.findById(id_user);
        }


        @RequestMapping(value = "/{user_name}", method = RequestMethod.GET)
        public List<UsersGis> getAll(@PathVariable("user_name") String user_name) {
                return usersGisServices.findByFirstName(user_name);
        }




        @RequestMapping(value = "/login", method = RequestMethod.POST)
        public UserInfo login(@RequestBody @Valid UserInput usergis) {
                //TODO do the decrypt
                return usersGisServices.findUsersInfo(usergis);
        }

        @RequestMapping(value = "/permissions", method = RequestMethod.POST)
        public List<UserPermissions> loginPermission(@RequestBody @Valid UserInput usergis) {
                //TODO do the decrypt
                return usersGisServices.findUsersPermission(usergis);
        }
}

