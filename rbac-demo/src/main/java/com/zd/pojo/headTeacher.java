package com.zd.pojo;

public class headTeacher {
    private Integer id;
    private Integer uid;
    private Integer classNum;

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

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "headTeacher{" +
                "id=" + id +
                ", uid=" + uid +
                ", classNum=" + classNum +
                '}';
    }
}
