package com.zd.mapper;

import com.zd.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from rbac.user")
    public List<User> selectAll();
    @Select("select * from rbac.user where username = #{username} and password = #{password}")
    public User selectUser(User user);
    @Select("select rid from rbac.user_role where uid = #{uid}")
    public int selectRoleIdByUserId(@Param("uid") int uid);
    @Select("select class_num from rbac.head_teacher")
    public int selectClassNum();
    @Select("select grade from rbac.grade_teacher")
    public int selectGrade();

}
