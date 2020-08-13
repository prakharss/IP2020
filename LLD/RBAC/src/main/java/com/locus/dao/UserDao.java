package com.locus.dao;


import com.locus.models.User;

public interface UserDao {

    void addUser(User user);
    void deleteUser(User user);
}
