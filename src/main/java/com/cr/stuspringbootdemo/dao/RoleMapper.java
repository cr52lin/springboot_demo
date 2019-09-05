package com.cr.stuspringbootdemo.dao;

import com.cr.stuspringbootdemo.domain.Permission;
import com.cr.stuspringbootdemo.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    public int delete(Integer id);
    public int add(Role role);
    public int update(Role role);
    public Role select(Integer id);

    List<Permission> getPermissionByRoleId(int role_id);
}
