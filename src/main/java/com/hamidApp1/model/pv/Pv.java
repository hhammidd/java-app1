package com.hamidApp1.model.pv;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pv")
public class Pv implements Serializable {
    @Id
    private int id_pv;
    private String code;
    private String pref_mgis;
    
    private int cod_mgis;
    private int certificate;
    private int pv_m;
    private int client_is;
    private String client_code;
    private String name1;
    private String name2;

    private int istat_id_tc;
    private int istat_id;

    private String address;
    private String cap;
    private String comune;
    private String provincia;

    private String tel1;
    private String tel2;
    private String tel3;
    private String cf_pi;
    private String fax;
    private String site;

    private String email;
    private String note;

    private Date updated_date;
    private int staet_id_tc;
    private Date ins_date;
    private int ins_user;

    private Date mod_date;
    private int mod_user;
    private String psw;
    private int first_to;

    private int presentation;
    private int newsletter;
    private int privacy;
    private int tc_state_other;

    private String note_for_disable;
    private String exit_tel;
    private String username;
    private String crypted_code;
    private String coords;

    public Pv() {
    }

    public Pv(int id_pv, String code, String pref_mgis, int cod_mgis, int certificate, int pv_m, int client_is, String client_code, String name1, String name2, int istat_id_tc, int istat_id, String address, String cap, String comune, String provincia, String tel1, String tel2, String tel3, String cf_pi, String fax, String site, String email, String note, Date updated_date, int staet_id_tc, Date ins_date, int ins_user, Date mod_date, int mod_user, String psw, int first_to, int presentation, int newsletter, int privacy, int tc_state_other, String note_for_disable, String exit_tel, String username, String crypted_code, String coords) {
        this.id_pv = id_pv;
        this.code = code;
        this.pref_mgis = pref_mgis;
        this.cod_mgis = cod_mgis;
        this.certificate = certificate;
        this.pv_m = pv_m;
        this.client_is = client_is;
        this.client_code = client_code;
        this.name1 = name1;
        this.name2 = name2;
        this.istat_id_tc = istat_id_tc;
        this.istat_id = istat_id;
        this.address = address;
        this.cap = cap;
        this.comune = comune;
        this.provincia = provincia;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.tel3 = tel3;
        this.cf_pi = cf_pi;
        this.fax = fax;
        this.site = site;
        this.email = email;
        this.note = note;
        this.updated_date = updated_date;
        this.staet_id_tc = staet_id_tc;
        this.ins_date = ins_date;
        this.ins_user = ins_user;
        this.mod_date = mod_date;
        this.mod_user = mod_user;
        this.psw = psw;
        this.first_to = first_to;
        this.presentation = presentation;
        this.newsletter = newsletter;
        this.privacy = privacy;
        this.tc_state_other = tc_state_other;
        this.note_for_disable = note_for_disable;
        this.exit_tel = exit_tel;
        this.username = username;
        this.crypted_code = crypted_code;
        this.coords = coords;
    }

    public int getId_pv() {
        return id_pv;
    }

    public void setId_pv(int id_pv) {
        this.id_pv = id_pv;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPref_mgis() {
        return pref_mgis;
    }

    public void setPref_mgis(String pref_mgis) {
        this.pref_mgis = pref_mgis;
    }

    public int getCod_mgis() {
        return cod_mgis;
    }

    public void setCod_mgis(int cod_mgis) {
        this.cod_mgis = cod_mgis;
    }

    public int getCertificate() {
        return certificate;
    }

    public void setCertificate(int certificate) {
        this.certificate = certificate;
    }

    public int getPv_m() {
        return pv_m;
    }

    public void setPv_m(int pv_m) {
        this.pv_m = pv_m;
    }

    public int getClient_is() {
        return client_is;
    }

    public void setClient_is(int client_is) {
        this.client_is = client_is;
    }

    public String getClient_code() {
        return client_code;
    }

    public void setClient_code(String client_code) {
        this.client_code = client_code;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getIstat_id_tc() {
        return istat_id_tc;
    }

    public void setIstat_id_tc(int istat_id_tc) {
        this.istat_id_tc = istat_id_tc;
    }

    public int getIstat_id() {
        return istat_id;
    }

    public void setIstat_id(int istat_id) {
        this.istat_id = istat_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getCf_pi() {
        return cf_pi;
    }

    public void setCf_pi(String cf_pi) {
        this.cf_pi = cf_pi;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

    public int getStaet_id_tc() {
        return staet_id_tc;
    }

    public void setStaet_id_tc(int staet_id_tc) {
        this.staet_id_tc = staet_id_tc;
    }

    public Date getIns_date() {
        return ins_date;
    }

    public void setIns_date(Date ins_date) {
        this.ins_date = ins_date;
    }

    public int getIns_user() {
        return ins_user;
    }

    public void setIns_user(int ins_user) {
        this.ins_user = ins_user;
    }

    public Date getMod_date() {
        return mod_date;
    }

    public void setMod_date(Date mod_date) {
        this.mod_date = mod_date;
    }

    public int getMod_user() {
        return mod_user;
    }

    public void setMod_user(int mod_user) {
        this.mod_user = mod_user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getFirst_to() {
        return first_to;
    }

    public void setFirst_to(int first_to) {
        this.first_to = first_to;
    }

    public int getPresentation() {
        return presentation;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }

    public int getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(int newsletter) {
        this.newsletter = newsletter;
    }

    public int getPrivacy() {
        return privacy;
    }

    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }

    public int getTc_state_other() {
        return tc_state_other;
    }

    public void setTc_state_other(int tc_state_other) {
        this.tc_state_other = tc_state_other;
    }

    public String getNote_for_disable() {
        return note_for_disable;
    }

    public void setNote_for_disable(String note_for_disable) {
        this.note_for_disable = note_for_disable;
    }

    public String getExit_tel() {
        return exit_tel;
    }

    public void setExit_tel(String exit_tel) {
        this.exit_tel = exit_tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCrypted_code() {
        return crypted_code;
    }

    public void setCrypted_code(String crypted_code) {
        this.crypted_code = crypted_code;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "PvTest{" +
                "id_pv=" + id_pv +
                ", code='" + code + '\'' +
                ", pref_mgis='" + pref_mgis + '\'' +
                ", cod_mgis=" + cod_mgis +
                ", certificate=" + certificate +
                ", pv_m=" + pv_m +
                ", client_is=" + client_is +
                ", client_code='" + client_code + '\'' +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", istat_id_tc=" + istat_id_tc +
                ", istat_id=" + istat_id +
                ", address='" + address + '\'' +
                ", cap='" + cap + '\'' +
                ", comune='" + comune + '\'' +
                ", provincia='" + provincia + '\'' +
                ", tel1='" + tel1 + '\'' +
                ", tel2='" + tel2 + '\'' +
                ", tel3='" + tel3 + '\'' +
                ", cf_pi='" + cf_pi + '\'' +
                ", fax='" + fax + '\'' +
                ", site='" + site + '\'' +
                ", email='" + email + '\'' +
                ", note='" + note + '\'' +
                ", updated_date=" + updated_date +
                ", staet_id_tc=" + staet_id_tc +
                ", ins_date=" + ins_date +
                ", ins_user=" + ins_user +
                ", mod_date=" + mod_date +
                ", mod_user=" + mod_user +
                ", psw='" + psw + '\'' +
                ", first_to=" + first_to +
                ", presentation=" + presentation +
                ", newsletter=" + newsletter +
                ", privacy=" + privacy +
                ", tc_state_other=" + tc_state_other +
                ", note_for_disable='" + note_for_disable + '\'' +
                ", exit_tel='" + exit_tel + '\'' +
                ", username='" + username + '\'' +
                ", crypted_code='" + crypted_code + '\'' +
                ", coords='" + coords + '\'' +
                '}';
    }
}
