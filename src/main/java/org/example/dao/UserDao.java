package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);
}
