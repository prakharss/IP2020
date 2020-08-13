package com.locus.services;

import com.locus.enums.ActionType;

public interface AccessManager {

    boolean hasAccess(String userId, String resourceId, ActionType actionType);
}
