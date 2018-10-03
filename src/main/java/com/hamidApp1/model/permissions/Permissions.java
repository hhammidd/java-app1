package com.hamidApp1.model.permissions;

import javax.persistence.*;


@Entity
@Table(name = "permissions")
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_permission;
    private String name;
    private String desc;

    @Override
    public String toString() {
        return "Permissions{" +
                "id_permission=" + id_permission +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
