package com.locus.dao;

import com.locus.enums.ActionType;

import java.util.HashMap;

public class RoleAccessDaoImpl implements RoleAccessDao {

    private static RoleAccessDao roleAccessDao;

    public RoleAccessDao getInstance() {
        if (roleAccessDao == null) {
            roleAccessDao = new RoleAccessDaoImpl();
        }
        return roleAccessDao;
    }

    //role id to actionType mapping
    private HashMap<String, ActionType> map;

    public void addRoleAccessMapping(String roleId, ActionType actionType) {
        // add to hashMap
    }

    public void deleteRoleAccessMapping(String roleId, ActionType actionType) {
        // delete from hashMap
    }
}
