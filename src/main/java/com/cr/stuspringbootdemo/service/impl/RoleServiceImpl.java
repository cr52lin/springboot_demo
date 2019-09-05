package com.cr.stuspringbootdemo.service.impl;

import com.cr.stuspringbootdemo.dao.PermissionMapper;
import com.cr.stuspringbootdemo.dao.RoleMapper;
import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.domain.Role;
import com.cr.stuspringbootdemo.service.PermissionService;
import com.cr.stuspringbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;


    @Override
    public int delete(Integer id) {
        return roleMapper.delete(id);
    }

    @Override
    public int add(Role role) {
        return roleMapper.add(role);
    }

    @Override
    public int update(Role role) {
        return roleMapper.update(role);
    }

    @Override
    public Role select(Integer id) {
        return roleMapper.select(id);
    }

    @Override
    public List<Permission> getPermissionByRoleId(int role_id){
        return roleMapper.getPermissionByRoleId(role_id);
    }
}
