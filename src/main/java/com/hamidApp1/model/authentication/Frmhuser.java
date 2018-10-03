package com.hamidApp1.model.authentication;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

import java.util.List;
@Entity
@Table(name ="frmhuser")
public class Frmhuser implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="COD_USER")
        private String codUser;

        @Column(name="COD_GROUP")
        private String codGroup;

        @Column(name="NAME_USER")
        private String nameUser;

        @Column(name="PASSWORD_USER")
        private String passwordUser;

        @Column(name="ROLE")
        private String role;

        @Column(name="STATUS")
        private BigDecimal status;

        @Column(name="USRPHONE")
        private String usrphone;

        @Column(name="USREMAILADDR")
        private String usremailaddr;

        @Column(name="USRSHORTNAME")
        private String usrshortname;

    public Frmhuser() {
    }

    public Frmhuser(String codUser, String codGroup, String nameUser, String passwordUser, String role, BigDecimal status, String usrphone, String usremailaddr, String usrshortname) {
        this.codUser = codUser;
        this.codGroup = codGroup;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.role = role;
        this.status = status;
        this.usrphone = usrphone;
        this.usremailaddr = usremailaddr;
        this.usrshortname = usrshortname;
    }

    public String getCodUser() {
        return codUser;
    }

    public void setCodUser(String codUser) {
        this.codUser = codUser;
    }

    public String getCodGroup() {
        return codGroup;
    }

    public void setCodGroup(String codGroup) {
        this.codGroup = codGroup;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getUsrphone() {
        return usrphone;
    }

    public void setUsrphone(String usrphone) {
        this.usrphone = usrphone;
    }

    public String getUsremailaddr() {
        return usremailaddr;
    }

    public void setUsremailaddr(String usremailaddr) {
        this.usremailaddr = usremailaddr;
    }

    public String getUsrshortname() {
        return usrshortname;
    }

    public void setUsrshortname(String usrshortname) {
        this.usrshortname = usrshortname;
    }
}
