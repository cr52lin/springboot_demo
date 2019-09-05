package com.cr.stuspringbootdemo;

import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.domain.Role;
import com.cr.stuspringbootdemo.domain.User;
import com.cr.stuspringbootdemo.service.UserService;
import com.cr.stuspringbootdemo.service.impl.RoleServiceImpl;
import com.cr.stuspringbootdemo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RoleServiceImpl roleService;

   // @Test
    public void select() {

        User user = userService.select(3);
        System.out.println(user.getName());
    }


    //@Test
    public void selectRoleByUserName() {
        List<Role> list = new ArrayList<>();
        list = userService.getRoleByUserName("cp");
        System.out.println(list.size());
    }

   // @Test
    public void getPermissionByRoleId() {
        List<Permission> list = new ArrayList<>();
        list = roleService.getPermissionByRoleId(3);
        System.out.println(list);
    }

    @Test
    public void selectByName() {
        User user = userService.selectByName("cr");

        System.out.println(user);
    }

}
