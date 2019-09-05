package com.cr.stuspringbootdemo.service;



import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.domain.Role;

import java.util.List;

public interface RoleService {
    public int delete(Integer id);
    public int add(Role role);
    public int update(Role role);
    public Role select(Integer id);

    List<Permission> getPermissionByRoleId(int role_id);
}
