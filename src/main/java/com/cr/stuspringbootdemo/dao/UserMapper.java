package com.cr.stuspringbootdemo.dao;

import com.cr.stuspringbootdemo.domain.Role;
import com.cr.stuspringbootdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
     public int delete(Integer id);
     public int add(User user);
     public int update(User user);
     public User select(Integer id);

     public List<Role> getRoleByUserName(String username);
     public User selectByName(String name);

}
