package com.locus.dao;


public interface UserRolesDao {

    void addUserRole(String userId, String roleId);
    void deleteUserRole(String userId, String roleId);
}
