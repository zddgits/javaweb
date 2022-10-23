package com.zd.mapper;

import com.zd.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from rbac.user")
    public List<User> selectAll();

}
