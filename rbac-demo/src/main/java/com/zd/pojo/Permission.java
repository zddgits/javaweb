package com.zd.pojo;

public class Permission {
    private Integer id;
    private Integer operationId;
    private Integer objectId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", operationId=" + operationId +
                ", objectId=" + objectId +
                '}';
    }
}
