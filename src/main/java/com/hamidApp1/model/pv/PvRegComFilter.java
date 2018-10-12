package com.hamidApp1.model.pv;

public class PvRegComFilter {
    private String cap;
    private String comune;
    private String provincia;

    public PvRegComFilter() {
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public PvRegComFilter(String cap, String comune, String provincia) {
        this.cap = cap;
        this.comune = comune;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "PvRegComFilter{" +
                "cap='" + cap + '\'' +
                ", comune='" + comune + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
