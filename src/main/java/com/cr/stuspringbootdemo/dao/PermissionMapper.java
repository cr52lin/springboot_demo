package com.cr.stuspringbootdemo.dao;

import com.cr.stuspringbootdemo.domain.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMapper {
    public int delete(Integer id);
    public int add(Permission permission);
    public int update(Permission permission);
    public Permission select(Integer id);
}
