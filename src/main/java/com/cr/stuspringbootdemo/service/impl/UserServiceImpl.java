package com.cr.stuspringbootdemo.service.impl;


import com.cr.stuspringbootdemo.dao.UserMapper;
import com.cr.stuspringbootdemo.domain.Role;
import com.cr.stuspringbootdemo.domain.User;
import com.cr.stuspringbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int delete(Integer id) {
       return  userMapper.delete(id);

    }

    @Override
    public int add(User user) {
        return userMapper.add(user);

    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public User select(Integer id) {
        return userMapper.select(id);
    }


    @Override
    public List<Role> getRoleByUserName(String username){
        return userMapper.getRoleByUserName(username);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }
}
