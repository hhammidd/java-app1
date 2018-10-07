package com.hamidApp1.model.istat;

public class Istat_it_filter {
    private int id_region;
    private int id_province;

    public Istat_it_filter() {
    }

    public Istat_it_filter(int id_region, int id_province) {
        this.id_region = id_region;
        this.id_province = id_province;
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

    @Override
    public String toString() {
        return "Istat_it_filter{" +
                "id_region=" + id_region +
                ", id_province=" + id_province +
                '}';
    }
}
