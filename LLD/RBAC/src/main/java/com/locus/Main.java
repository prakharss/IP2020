//package com.locus;
//
//import com.locus.models.Resource;
//import com.locus.models.Role;
//import com.locus.models.User;
//
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//
//        AuthSystem authSystem = AuthSystem.getInstance(); //kind of DB ready
//
//        User user1 = authSystem.addUser("firstName", "lastName", "test1234@gmail.com");
//
//
//        Resource resource1 = authSystem.addNewResource("resource1");
//        Resource resource2 = authSystem.addNewResource("resource2");
//        Resource resource3 = authSystem.addNewResource("resource3");
//        Resource resource4 = authSystem.addNewResource("resource4");
//        Resource resource5 = authSystem.addNewResource("resource5");
//
//        Role role1 = authSystem.addNewRole("role1", Arrays.asList(resource1.getId(), resource2.getId()));
////        authSystem.
//        Role role2 = authSystem.addNewRole("role2", Arrays.asList(resource3.getId(), resource4.getId()));
//        Role role3 = authSystem.addNewRole("role3", Arrays.asList(resource4.getId(), resource2.getId()));
//        Role role4 = authSystem.addNewRole("role4", Arrays.asList(resource1.getId(), resource5.getId()));
//        Role role5 = authSystem.addNewRole("role5", Arrays.asList(resource3.getId(), resource2.getId()));
//
//        authSystem.addRoleToUser(role1, user1);
//
//    }
//
//    // 1. System should be able to assign a role to user and remove a user from the role.   => Admin type of user
//    // 2. User can have multiple roles                                                      => List<com.locus.models.Role> will be there in User object
//    // 3. Access to resources for users are controlled strictly by the role                 => hasAccess(com.locus.models.Resource r, com.locus.enums.ActionType a, User u)
//    // 4. Given user, resource, action_type tell whether user has access to the resource    =>  ||
//
//
//    private void hasAccess() {
//
//    }
//    // user -> multiple roles
//    // resource
//
//
//}
