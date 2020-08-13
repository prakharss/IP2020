package data;

import com.locus.enums.ActionType;
import com.locus.models.Role;
import com.locus.dao.RoleAccessDao;
import com.locus.dao.RoleAccessDaoImpl;
import com.locus.dao.RoleResourceDao;
import com.locus.dao.RoleResourceDaoImpl;
import com.locus.dao.UserRolesDao;
import com.locus.dao.UserRolesDaoImpl;
import com.locus.models.User;


public class Test {

    @org.junit.Test()
    public void test() {

        User user = new User("first", "last", "ok@gmail.com");
        User user1 = new User("first1", "last1", "ok1@gmail.com");

        Role role = new Role("Admin");
        Role role1 = new Role("ReadOnlyUser");

        RoleAccessDao roleAccessDao = new RoleAccessDaoImpl();
       // roleAccessDao.addRoleAccessMapping(role.getId().toString(), ActionType.READ);

        UserRolesDao userRolesDao = new UserRolesDaoImpl();
       // userRolesDao.addUserRole(user.getId().toString(), role.getId().toString());

        RoleResourceDao roleResourceDao = new RoleResourceDaoImpl();

//        roleResourceDao.addRoleResource();
    }
}


// User -> multiple roles
// each role -> multiple resources with actionType
// each resource -> name