package com.hamidApp1.controller.usersTests;

import com.hamidApp1.model.users.User;
import com.hamidApp1.service.usersTest.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usertest")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/findAll")
    public List<User> getAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findOne(@PathVariable long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/{firstName}", method = RequestMethod.GET)
    public List<User> getAll(@PathVariable("firstName") String firstName) {
       return userService.findByFirstName(firstName);
    }
}
