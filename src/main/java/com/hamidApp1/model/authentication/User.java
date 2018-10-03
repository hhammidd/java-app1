package com.hamidApp1.model.authentication;

public class User {
    private String cod;
    private String name;
    private String password;
    private String cod_group;
    private String des_group;
    private String role;
    private int status;
    private String email;
    private String phone;
    private String shortName;
    //private ArrayList<AbiBean> abi;
    private String operationType;// CRUDE INSERT(I) se grid assente O UPDATE(U) se presente
    private String ppcpi;

    public User() {
    }

    public User(String cod, String name, String password, String cod_group, String des_group, String role, int status, String email, String phone, String shortName, String operationType, String ppcpi) {
        this.cod = cod;
        this.name = name;
        this.password = password;
        this.cod_group = cod_group;
        this.des_group = des_group;
        this.role = role;
        this.status = status;
        this.email = email;
        this.phone = phone;
        this.shortName = shortName;
        this.operationType = operationType;
        this.ppcpi = ppcpi;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCod_group() {
        return cod_group;
    }

    public void setCod_group(String cod_group) {
        this.cod_group = cod_group;
    }

    public String getDes_group() {
        return des_group;
    }

    public void setDes_group(String des_group) {
        this.des_group = des_group;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getPpcpi() {
        return ppcpi;
    }

    public void setPpcpi(String ppcpi) {
        this.ppcpi = ppcpi;
    }
}
