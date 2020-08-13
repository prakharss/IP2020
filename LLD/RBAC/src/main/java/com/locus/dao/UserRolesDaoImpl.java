package com.locus.dao;

import java.util.HashMap;
import java.util.List;

public class UserRolesDaoImpl implements UserRolesDao {

    private static UserRolesDao userRolesDao;

    // userid to list of roleIds mapping
    private HashMap<String, List<String>> map; //will serve as in-memory database

    public UserRolesDao getInstance() {
        if (userRolesDao == null) {
            userRolesDao = new UserRolesDaoImpl();
        }
        return userRolesDao;
    }

    public void addUserRole(String userId, String roleId) {
        // add to the map
    }

    public void deleteUserRole(String userId, String roleId) {
        // delete from the map
    }
}
