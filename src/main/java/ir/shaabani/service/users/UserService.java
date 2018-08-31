package ir.shaabani.service.users;

import ir.shaabani.model.users.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(long id);
    public List<User> findByFirstName(String firstName);
}
