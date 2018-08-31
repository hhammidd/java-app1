package ir.shaabani.service.users.impl;

import ir.shaabani.dao.users.UserDao;
import ir.shaabani.model.users.User;
import ir.shaabani.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(long id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        return userDao.findByFirstName(firstName);
    }
}
