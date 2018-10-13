package com.hamidApp1.model.usersGis;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PermissionList {
    @Id
    private int id_permissions;
    private String name;

    public PermissionList() {
    }

    public PermissionList(int id_permissions, String name) {
        this.id_permissions = id_permissions;
        this.name = name;
    }

    public int getId_permissions() {
        return id_permissions;
    }

    public void setId_permissions(int id_permissions) {
        this.id_permissions = id_permissions;
    }

    @Override
    public String toString() {
        return "PermissionList{" +
                "id_permissions=" + id_permissions +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
