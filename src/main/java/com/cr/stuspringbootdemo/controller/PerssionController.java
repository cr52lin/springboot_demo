package com.cr.stuspringbootdemo.controller;


import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.domain.User;
import com.cr.stuspringbootdemo.service.impl.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PerssionController {
//    @Autowired
//    private PermissionServiceImpl permissionService;
//
//    @RequestMapping("/deletePermission/{id}")
//    @ResponseBody
//    public Object delete(@PathVariable Integer id){
//        Integer data = permissionService.delete(id);
//        if(data>0){
//            return "删除成功";
//        }else{
//            return "删除失败";
//        }
//    }
//
//    @RequestMapping("/addPermission/{id}/{permission}/{role_id}")
//    @ResponseBody
//    public Object add(@PathVariable Integer id,@PathVariable String permission,@PathVariable Integer role_id){
//        Permission p  = new Permission();
//        p.setId(id);
//        p.setPermission(permission);
//        p.setRole_id(role_id);
//        Integer data = permissionService.add(p);
//        if(data>0){
//            return "增加成功";
//        }else{
//            return "增加失败";
//        }
//
//
//    }
//
//    @RequestMapping("/updatePermission/{id}/{permission}/{role_id}")
//    @ResponseBody
//    public Object update(@PathVariable Integer id,@PathVariable String permission,@PathVariable Integer role_id){
//        Permission p  = new Permission();
//        p.setId(id);
//        p.setPermission(permission);
//        p.setRole_id(role_id);
//
//        Integer data = permissionService.update(p);
//        if(data>0){
//            return "修改成功";
//        }else{
//            return "修改失败";
//        }
//
//
//    }
//
//
//    @RequestMapping("/selectPermission/{id}")
//    @ResponseBody
//    public Object select(@PathVariable Integer id){
//
//        Permission p = permissionService.select(id);
//        return p;
//
//
//
//    }
}
