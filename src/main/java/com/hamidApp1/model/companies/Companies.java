package com.hamidApp1.model.companies;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "companies")
public class Companies implements Serializable {

    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_company;
    private String name_company;

    public Companies() {
    }

    public Companies(int id_company, String name_company) {
        this.id_company = id_company;
        this.name_company = name_company;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "id_company=" + id_company +
                ", name_company='" + name_company + '\'' +
                '}';
    }
}
