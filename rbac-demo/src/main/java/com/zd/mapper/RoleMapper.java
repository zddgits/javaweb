package com.zd.mapper;

import com.zd.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RoleMapper {
    @Select("select * from rbac.role where id = #{id}")
    public Role selectById(@Param("id") int id);
    @Select("select pid from rbac.role_permission where rid = #{rid}")
    public int selectPermissionIdByRoleId(@Param("rid") int rid);

}
