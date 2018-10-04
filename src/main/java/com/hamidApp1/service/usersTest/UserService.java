package com.hamidApp1.service.usersTest;

import com.hamidApp1.model.users.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(long id);
    public User findByFirstName(String firstName);
}
