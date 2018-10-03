package com.hamidApp1.model.salesPoint;

import javax.persistence.*;

@Entity
@Table(name = "pvtest")
public class PvTest {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int pv_id;
    private String name1 ;
    private String username;
    private String password;
    private String comune;
    private int istat_id;

    public int getIstat_id() {
        return istat_id;
    }

    public void setIstat_id(int istat_id) {
        this.istat_id = istat_id;
    }

    public int getPv_id() {
        return pv_id;
    }

    public void setPv_id(int pv_id) {
        this.pv_id = pv_id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    @Override
    public String toString() {
        return "PvTest{" +
                "pv_id=" + pv_id +
                ", name1='" + name1 + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", comune='" + comune + '\'' +
                ", istat_id=" + istat_id +
                '}';
    }
}
