package com.cr.stuspringbootdemo.service;

import com.cr.stuspringbootdemo.domain.Role;
import com.cr.stuspringbootdemo.domain.User;

import java.util.List;

public interface UserService {
    public int delete(Integer id);
    public int add(User user);
    public int update(User user);
    public User select(Integer id);

    public List<Role> getRoleByUserName(String username);
    public User selectByName(String name);
}
