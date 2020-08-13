//package com.locus;
//
//import com.locus.models.Resource;
//import com.locus.models.Role;
//import com.locus.models.User;
//import main.java.locus.models.User;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//public class AuthSystem {
//
//    private static AuthSystem authSystem;
//
//    private static List<User> users;
//    private static List<Role> roles;
//    private static List<Resource> resources;
//
////    private static Map<RoleResource, ActionType> map;
//
//    public static AuthSystem getInstance() {
//        if (authSystem == null) {
//            authSystem = new AuthSystem();
//            users = new ArrayList<>();
//            roles = new ArrayList<>();
//            resources = new ArrayList<>();
////            map = new HashMap<>();
//        }
//        return authSystem;
//    }
//
//    public User addUser(String firstName, String lastName, String emailId) {
//        User user = new User(firstName, lastName, emailId);
//        users.add(user);
//        return user;
//    }
//
//    public boolean addRoleToUser(Role role, User user) {
//
//        List<UUID> roles = user.getRoleIds();
//        roles.add(role.getId());
//
//        user.setRoleIds(roles);
//        return true;
//    }
//
//    public Role addNewRole(String roleName, List<UUID> resources) {
//        Role role = new Role(roleName, resources);
//        roles.add(role);
//        return role;
//    }
//
//    public Resource addNewResource(String name) {
//        Resource resource = new Resource(name);
//        resources.add(resource);
//        return resource;
//    }
//
//    public static Map<RoleResource, ActionType> getMap() {
//        return map;
//    }
//
//    public static void setMap(Map<RoleResource, ActionType> map) {
//        AuthSystem.map = map;
//    }
//}
