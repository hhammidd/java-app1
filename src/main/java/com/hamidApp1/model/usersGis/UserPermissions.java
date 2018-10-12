package com.hamidApp1.model.usersGis;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserPermissions implements Serializable {

    @Id
    private int id_permission;
    private int id_user;
    private int administrator;
    private String user_name;
    private int id_company_mGis;
    private int id_role;
    private String name;


    public UserPermissions() {
    }

    public UserPermissions(int administrator, String user_name, int id_user, int id_company_mGis, int id_role, String name, int id_permission) {
        this.administrator = administrator;
        this.user_name = user_name;
        this.id_user = id_user;
        this.id_company_mGis = id_company_mGis;
        this.id_role = id_role;
        this.name = name;
        this.id_permission = id_permission;
    }

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_company_mGis() {
        return id_company_mGis;
    }

    public void setId_company_mGis(int id_company_mGis) {
        this.id_company_mGis = id_company_mGis;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_permission() {
        return id_permission;
    }

    public void setId_permission(int id_permission) {
        this.id_permission = id_permission;
    }

    @Override
    public String toString() {
        return "UserPermissions{" +
                "administrator=" + administrator +
                ", user_name='" + user_name + '\'' +
                ", id_user=" + id_user +
                ", id_company_mGis=" + id_company_mGis +
                ", id_role=" + id_role +
                ", name='" + name + '\'' +
                ", id_permission=" + id_permission +
                '}';
    }
}

