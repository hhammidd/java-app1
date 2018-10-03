package com.hamidApp1.model.istat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "istat_it")
public class Istat_it {
    @Id
    private int id;
    private int id_region;
    private int id_province;

    private int id_comune;
    private Date date;

    public Istat_it(int id, int id_region, int id_province, int id_comune, Date date) {
        this.id = id;
        this.id_region = id_region;
        this.id_province = id_province;
        this.id_comune = id_comune;
        this.date = date;
    }

    public Istat_it() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    public int getId_province() {
        return id_province;
    }

    public void setId_province(int id_province) {
        this.id_province = id_province;
    }

    public int getId_comune() {
        return id_comune;
    }

    public void setId_comune(int id_comune) {
        this.id_comune = id_comune;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Istat_it{" +
                "id=" + id +
                ", id_region=" + id_region +
                ", id_province=" + id_province +
                ", id_comune=" + id_comune +
                ", date=" + date +
                '}';
    }
}
