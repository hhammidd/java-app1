package com.hamidApp1.model.usersGis;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserPermitList {
    @Id
    private int id_permission;
    private String name;

    public UserPermitList() {
    }

    public UserPermitList(int id_permission, String name) {
        this.id_permission = id_permission;
        this.name = name;
    }

    public int getId_permission() {
        return id_permission;
    }

    public void setId_permission(int id_permission) {
        this.id_permission = id_permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserPermitList{" +
                "id_permission=" + id_permission +
                ", name='" + name + '\'' +
                '}';
    }
}
