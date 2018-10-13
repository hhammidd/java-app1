package com.hamidApp1.model.usersGis;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class UserLists {

    @Id
    private int id_user;
    private int id_company;
    private int id_company_mGis;
    private String user_name;
    private String password;
    private int id_role;
    private int administrator;
    private int users_ins;

    private ArrayList<UserPermitList> userPermitLists;

    public UserLists() {
    }

    public UserLists(int id_user, int id_company, int id_company_mGis, String user_name, String password, int id_role, int administrator, int users_ins, ArrayList<UserPermitList> userPermitLists) {
        this.id_user = id_user;
        this.id_company = id_company;
        this.id_company_mGis = id_company_mGis;
        this.user_name = user_name;
        this.password = password;
        this.id_role = id_role;
        this.administrator = administrator;
        this.users_ins = users_ins;
        this.userPermitLists = userPermitLists;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public int getId_company_mGis() {
        return id_company_mGis;
    }

    public void setId_company_mGis(int id_company_mGis) {
        this.id_company_mGis = id_company_mGis;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }

    public int getUsers_ins() {
        return users_ins;
    }

    public void setUsers_ins(int users_ins) {
        this.users_ins = users_ins;
    }

    public ArrayList<UserPermitList> getUserPermitLists() {
        return userPermitLists;
    }

    public void setUserPermitLists(ArrayList<UserPermitList> userPermitLists) {
        this.userPermitLists = userPermitLists;
    }

    @Override
    public String toString() {
        return "UserLists{" +
                "id_user=" + id_user +
                ", id_company=" + id_company +
                ", id_company_mGis=" + id_company_mGis +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", id_role=" + id_role +
                ", administrator=" + administrator +
                ", users_ins=" + users_ins +
                ", userPermitLists=" + userPermitLists +
                '}';
    }
}
