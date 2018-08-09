/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.primitiveObsession.codeSmell;


/**
 *
 * @author eduar
 */
public class Laptop {
    private String description;
    private String brand;
    private String ownerName;
    private String ownerPhone;
    private String ownerMail;
    private String ownerPersonalNumber;

    public Laptop(String address, String city, String owner, String ownerPhone, String ownerMail, String ownerPersonalNumber) {
        this.description = address;
        this.brand = city;
        this.ownerName = owner;
        this.ownerPhone = ownerPhone;
        this.ownerMail = ownerMail;
        this.ownerPersonalNumber = ownerPersonalNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
