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
public class User {
    private String userId;
    private String firstName;
    private String fatherName;
    private String familyName;
    private String motherName;
    private Date   birthdate;
    private String country;
    private String nationalty;
    private String adress;
    private String city;
    private String fatherMobile;
    private String homePhone;
    private String gender;
    private Object image;

    public User(String userId,String firstName, String fatherName, String familyName, String motherName, Date birthdate, String country, String nationalty, String adress, String city, String fatherMobile, String homePhone, String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.familyName = familyName;
        this.motherName = motherName;
        this.birthdate = birthdate;
        this.country = country;
        this.nationalty = nationalty;
        this.adress = adress;
        this.city = city;
        this.fatherMobile = fatherMobile;
        this.homePhone = homePhone;
        this.gender = gender;
        this.image = image;
    }
        public String getuserId(String id) {
        this.userId=id;
        return userId;
    }
    public String getuserId() {
        return userId;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMotherName() {
        return motherName;
    }

    public Date getNbirthdate() {
        return birthdate;
    }

    public String getCountry() {
        return country;
    }

    public String getNationalty() {
        return nationalty;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getFatherMobile() {
        return fatherMobile;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getGender() {
        return gender;
    }

    public Object getImage() {
        return image;
    }
   
    
    
}
