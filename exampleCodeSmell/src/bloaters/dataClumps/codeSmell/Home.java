/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.dataClumps.codeSmell;

/**
 *
 * @author eduar
 */
public class Home {
    private String address;
    private String city;
    private String ownerName;
    private String ownerPhone;
    private String ownerMail;
    private String ownerPersonalNumber;

    public Home(String address, String city, String owner, String ownerPhone, String ownerMail, String ownerPersonalNumber) {
        this.address = address;
        this.city = city;
        this.ownerName = owner;
        this.ownerPhone = ownerPhone;
        this.ownerMail = ownerMail;
        this.ownerPersonalNumber = ownerPersonalNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerMail() {
        return ownerMail;
    }

    public void setOwnerMail(String ownerMail) {
        this.ownerMail = ownerMail;
    }

    public String getOwnerPersonalNumber() {
        return ownerPersonalNumber;
    }

    public void setOwnerPersonalNumber(String ownerPersonalNumber) {
        this.ownerPersonalNumber = ownerPersonalNumber;
    }
    
    
}
