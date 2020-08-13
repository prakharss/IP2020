package com.locus.dao;

import com.locus.enums.ActionType;

public interface RoleAccessDao {

    void addRoleAccessMapping(String roleId, ActionType actionType);

    void deleteRoleAccessMapping(String roleId, ActionType actionType);
}
