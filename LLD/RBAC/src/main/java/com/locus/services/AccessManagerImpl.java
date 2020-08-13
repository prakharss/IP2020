package com.locus.services;

import com.locus.enums.ActionType;

/** Service Layer **/
public class AccessManagerImpl implements AccessManager {

    private static AccessManager accessManager;

//    private RoleAccessDao roleAccessDao;
//    private RoleResourceDao roleResourceDao;
//    private UserRolesDao userRolesDao;

    public AccessManager getInstance() {
        if (accessManager == null) {
            accessManager = new AccessManagerImpl();
        }
        return accessManager;
    }

//    public AccessManagerImpl(RoleAccessDao roleAccessDao, RoleResourceDao roleResourceDao, UserRolesDao userRolesDao) {
//        this.roleAccessDao = roleAccessDao;
//        this.roleResourceDao = roleResourceDao;
//        this.userRolesDao = userRolesDao;
//    }

    public boolean hasAccess(String userId, String resourceId, ActionType actionType) {
        return false;
    }
}
