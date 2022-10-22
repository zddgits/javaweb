package com.zd.pojo;

public class Student {
    private Integer id;
    private Integer uid;
    private String name;
    private String sex;

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    private Integer classNum;
    private Integer grade;
    private String birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", classNum='" + classNum + '\'' +
                ", grade='" + grade + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
