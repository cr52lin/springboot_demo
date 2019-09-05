package com.cr.stuspringbootdemo.service.impl;

import com.cr.stuspringbootdemo.dao.PermissionMapper;
import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int delete(Integer id) {
        return permissionMapper.delete(id);
    }

    @Override
    public int add(Permission permission) {
        return permissionMapper.add(permission);
    }

    @Override
    public int update(Permission permission) {
        return permissionMapper.update(permission);
    }

    @Override
    public Permission select(Integer id) {
        return permissionMapper.select(id);
    }
}
