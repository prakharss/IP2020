package com.locus.dao;

import com.locus.enums.ActionType;

public interface RoleResourceDao {

    void addRoleResource(String roleId, String resourceId, ActionType actionType);

    void deleteRoleResource(String roleId, String resourceId, ActionType actionType);
}
