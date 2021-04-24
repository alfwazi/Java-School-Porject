/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.classes;

import java.sql.Date;

/**
 *
 * @author Badr-Alfwazi
 */
public class Employee {
    private String eid;
    private String Efname;
    private String Efaname;
    private String Elname;
    private String Stateemployee;
    private String certfction;
    private Date   Ebirthdte;
    private String Ecountry;
    private String Enantionaly;
    private String Eaddress;
    private String Ecity;
    private String Mobile;
    private String Tel;
    private String Email;
    private String Egender;
    private String Status;
    private Object Epicture;
    private String note;

    public Employee(String eid,String Efname, String Efaname, String Elname, String Stateemployee,String certfction, Date Ebirthdte, String Ecountry, String Enantionaly, String Eaddress, String Ecity, String Mobile, String Tel, String Egender) {
        this.eid = eid;
        this.Efname = Efname;
        this.Efaname = Efaname;
        this.Elname = Elname;
        this.Stateemployee = Stateemployee;
        this.certfction  = certfction;
        this.Ebirthdte = Ebirthdte;
        this.Ecountry = Ecountry;
        this.Enantionaly = Enantionaly;
        this.Eaddress = Eaddress;
        this.Ecity = Ecity;
        this.Mobile = Mobile;
        this.Tel = Tel;
        this.Egender = Egender;
    }


    public String getEid() {
        return eid;
    }

    public String getEfname() {
        return Efname;
    }

    public String getEfaname() {
        return Efaname;
    }

    public String getElname() {
        return Elname;
    }

    public String getStateemployee() {
        return Stateemployee;
    }

    public String getCertfction() {
        return certfction;
    }

    public Date getEbirthdte() {
        return Ebirthdte;
    }

    public String getEcountry() {
        return Ecountry;
    }

    public String getEnantionaly() {
        return Enantionaly;
    }

    public String getEaddress() {
        return Eaddress;
    }

    public String getEcity() {
        return Ecity;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getTel() {
        return Tel;
    }

    public String getEmail() {
        return Email;
    }

    public String getEgender() {
        return Egender;
    }

    public String getStatus() {
        return Status;
    }

    public Object getEpicture() {
        return Epicture;
    }

    public String getNote() {
        return note;
    }

}
