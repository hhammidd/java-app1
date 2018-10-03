package com.hamidApp1.controller.SecurityUsers;

import com.hamidApp1.model.authentication.Frmhuser;
import com.hamidApp1.model.authentication.User;
import com.hamidApp1.service.users.UsersService;
import com.hamidApp1.service.util.Constant;
import com.hamidApp1.service.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class AuthenticationController {

    @Autowired
    private UsersService usersService;

    @PostMapping(value = "/login")
    public GenericResponse<Map<String, Object>> login(@RequestBody @Valid User user) {
        String token = null;
        User u = null;
        Map<String, Object> tokenMap = null;
        //BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
        String secretKey = null;
        String userCode = "";
        tokenMap = new HashMap<>();

        Frmhuser f = null;

        user.getPassword();
        user.getCod();
        System.out.println("hey : " + user.getPassword());
        System.out.println("hey2 : " + user.getCod());

        //f = (Frmhuser) usersService.findByUserCod(user.getCod());
        //System.out.println("ff : " + f);
        if (u != null) {
            String userCod = "";

            return new GenericResponse<>(tokenMap, "AUTHORIZED", Constant.SUCCESS);
        } else {
            tokenMap.put("token", null);
            return new GenericResponse<>(tokenMap, "UNAUTHORIZED", Constant.ERROR);
        }

    }
    }
