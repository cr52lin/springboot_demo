package com.cr.stuspringbootdemo.service;


import com.cr.stuspringbootdemo.domain.Permission;

public interface PermissionService {
    public int delete(Integer id);
    public int add(Permission permission);
    public int update(Permission permission);
    public Permission select(Integer id);
}
