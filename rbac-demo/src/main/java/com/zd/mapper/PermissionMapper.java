package com.zd.mapper;

import com.zd.pojo.Permission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PermissionMapper {
    @Select("select * from rbac.permission where id = #{id}")
    public Permission selectById(@Param("id") int id);
}
