package com.hamidApp1.model.usersGis;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserInfo implements Serializable {

    @Id
    private String name_company;
    private String user_name;
    private int id_user;
    private int administrator;
    private String password;
    private int id_company;

    public UserInfo() {
    }

    public UserInfo(String name_company, String user_name, int id_user, int administrator, String password, int id_company) {
        this.name_company = name_company;
        this.user_name = user_name;
        this.id_user = id_user;
        this.administrator = administrator;
        this.password = password;
        this.id_company = id_company;
    }

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
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

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name_company='" + name_company + '\'' +
                ", user_name='" + user_name + '\'' +
                ", id_user=" + id_user +
                ", administrator=" + administrator +
                ", password='" + password + '\'' +
                ", id_company=" + id_company +
                '}';
    }
}
