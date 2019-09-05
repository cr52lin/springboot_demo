package com.cr.stuspringbootdemo.controller;

import com.cr.stuspringbootdemo.domain.User;
import com.cr.stuspringbootdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Object delete(@PathVariable Integer id){

        Integer data = userService.delete(id);
        if(data>0){
            return "删除成功";
        }else{
            return "删除失败";
        }


    }


    @RequestMapping("/add/{id}/{password}/{name}/{sal}")
    @ResponseBody
    public Object add(@PathVariable Integer id,@PathVariable String password,@PathVariable String name,@PathVariable Double sal){
        User user  = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setSal(sal);
        Integer data = userService.add(user);
        if(data>0){
            return "增加成功";
        }else{
            return "增加失败";
        }


    }

    @RequestMapping("/update/{id}/{password}/{name}/{sal}")
    @ResponseBody
    public Object update(@PathVariable Integer id,@PathVariable String password,@PathVariable String name,@PathVariable Double sal){
        User user  = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setSal(sal);
        Integer data = userService.update(user);
        if(data>0){
            return "修改成功";
        }else{
            return "修改失败";
        }


    }


    @RequestMapping("/select/{id}")
    @ResponseBody
    public Object select(@PathVariable Integer id){

        User user = userService.select(id);
        return user;


    }

}
