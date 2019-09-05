package com.cr.stuspringbootdemo.controller;


import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.domain.Role;
import com.cr.stuspringbootdemo.service.impl.PermissionServiceImpl;
import com.cr.stuspringbootdemo.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {
    @Autowired
    private RoleServiceImpl roleService;

    @RequestMapping("/deleteRole/{id}")
    @ResponseBody
    public Object delete(@PathVariable Integer id){
        Integer data = roleService.delete(id);
        if(data>0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping("/addRole/{id}/{role_name}/{user_id}")
    @ResponseBody
    public Object add(@PathVariable Integer id,@PathVariable String role_name,@PathVariable Integer user_id){
        Role role = new Role();
        role.setId(id);
        role.setRole_name(role_name);
        role.setUser_id(user_id);
        Integer data = roleService.add(role);
        if(data>0){
            return "增加成功";
        }else{
            return "增加失败";
        }


    }

    @RequestMapping("/updateRole/{id}/{role_name}/{user_id}")
    @ResponseBody
    public Object update(@PathVariable Integer id,@PathVariable String role_name,@PathVariable Integer user_id){
        Role role = new Role();
        role.setId(id);
        role.setRole_name(role_name);
        role.setUser_id(user_id);

        Integer data = roleService.update(role);
        if(data>0){
            return "修改成功";
        }else{
            return "修改失败";
        }


    }


    @RequestMapping("/selectRole/{id}")
    @ResponseBody
    public Object select(@PathVariable Integer id){

        Role role = roleService.select(id);
        return role;



    }
}
