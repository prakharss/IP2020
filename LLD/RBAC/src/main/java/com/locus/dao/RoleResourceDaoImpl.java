package com.locus.dao;

import com.locus.enums.ActionType;

import java.util.HashMap;
import java.util.UUID;

public class RoleResourceDaoImpl implements RoleResourceDao {

    private static RoleResourceDao roleResourceDao;

    public RoleResourceDao getInstance() {
        if (roleResourceDao == null) {
            roleResourceDao = new RoleResourceDaoImpl();
        }
        return roleResourceDao;
    }

    // key: roleId, value: Map of (key: resourceId, value: actionType)
    private HashMap<UUID, HashMap<String, ActionType>> map;

    public void addRoleResource(String roleId, String resourceId, ActionType actionType) {
        // add to the hashmap
    }

    public void deleteRoleResource(String roleId, String resourceId, ActionType actionType) {
        // delete from the hashmap
    }
}
