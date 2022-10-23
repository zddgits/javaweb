package com.zd.mapper;

import com.zd.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from rbac.student")
    public List<Student> selectAll();

    @Select("select * from rbac.student where class_num = #{classNum}")
    public List<Student> selectByClass(@Param("classNum") int classNum);

    @Select("select * from rbac.student where grade = #{grade}")
    public List<Student> selectByGrade(@Param("grade") int grade);

}
