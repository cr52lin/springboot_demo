package com.cr.stuspringbootdemo.controller;

import com.cr.stuspringbootdemo.config.jedis.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public Object Test(){
        return "hello world";
    }

    @RequestMapping(value = "/restTest/{name}")
    public Object restTest(@PathVariable String name){
        return "restTest"  + name;
    }

    @Autowired
    private JedisUtil jedis;
    @RequestMapping("/restJedis/{val}")
    public Object restJedis(@PathVariable String val){
        jedis.set("key-"+val,val);
        return "result-OK";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/getJDBC/{password}")
    public Object getJDBC(@PathVariable Integer password){
        String sql = "select * from user where password = " + password;
        Map<String,Object> data = jdbcTemplate.queryForMap(sql);
        return data;

    }
}



