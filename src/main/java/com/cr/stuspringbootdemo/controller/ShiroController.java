package com.cr.stuspringbootdemo.controller;

import com.cr.stuspringbootdemo.domain.User;
import com.cr.stuspringbootdemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShiroController {
    @Autowired
    private UserService userService;

    @RequestMapping("/loginShiro/{username}/{password}")
    @ResponseBody
    public Object loginShiro(@PathVariable("username") String username,@PathVariable("password") String password){

        if(username != null){
            User user = userService.selectByName(username);
            if(user != null && user.getPassword().equals(password)){
                //添加用户信息
                Subject subject = SecurityUtils.getSubject();
                UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
                //进行验证，这里可以捕获异常，然后返回对应信息
                subject.login(usernamePasswordToken);
                System.out.println("loginShiro:"+usernamePasswordToken);
                return "loginShiro!";
            }
        }
        //调用通过logout后通过setLoginUrl重新进入该方法
        return "it is logout!";
    }


    @RequestMapping("/logout")
    public Object logout(){
        return "It is logout";
    }

    @RequestMapping("/index")
    public Object index(){
        return "It is index";
    }

    @RequestMapping("/errorpage")
    public Object error(){
        return "It is error";
    }

    @RequestMapping("/testShiro/{test}")
    public Object testShiro(){
        //业务省略。。
        return "testShiro:success!";
    }

    //认证角色，logical = Logical.OR/Logical.AND
    @RequestMapping("/testAuthorityRole")
    @RequiresRoles(value = {"admin","user"},logical = Logical.OR)
    @RequiresPermissions(value = {"delete","update"},logical = Logical.OR)
    public Object testAuthorityRole(){
        return "testAuthorityRole:succcess!";
    }

    //认证操作权限
    @RequestMapping("/testAuthorityPermission")
    @RequiresPermissions(value = {"create","update"})
    public Object testAuthorityPermission(){
        return "testAuthorityPermissionPermission:succcess!";
    }

}
