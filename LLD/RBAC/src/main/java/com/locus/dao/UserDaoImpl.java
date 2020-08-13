package com.locus.dao;

import com.locus.models.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private static UserDao userDao;

    public UserDao getInstance() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

    // userid to list of roleIds mapping
    private List<User> list; //will serve as in-memory database

    public void addUser(User user) {
        //add to the list
    }

    public void deleteUser(User user) {
        //remove from the list
    }
}
