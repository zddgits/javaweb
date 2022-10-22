package com.zd.pojo;

public class gradeTeacher {
    private Integer id;
    private Integer uid;
    private Integer grade;

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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "gradeTeacher{" +
                "id=" + id +
                ", uid=" + uid +
                ", grade=" + grade +
                '}';
    }
}
