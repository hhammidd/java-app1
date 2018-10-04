package com.hamidApp1.model.permissions;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permissions")
public class Permissions implements Serializable {

    @Id
    private int id_per;
    private String name;
    private String desc;

    public Permissions() {
    }

    public Permissions(int id_per, String name, String desc) {
        this.id_per = id_per;
        this.name = name;
        this.desc = desc;
    }

    public int getId_per() {
        return id_per;
    }

    public void setId_per(int id_per) {
        this.id_per = id_per;
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

    @Override
    public String toString() {
        return "Permissions{" +
                "id_per=" + id_per +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
