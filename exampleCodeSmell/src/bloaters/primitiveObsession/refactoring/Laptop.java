/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.primitiveObsession.refactoring;


/**
 *
 * @author eduar
 */
public class Laptop {
    private String description;
    private String brand;
    private Owner owner;

    public Laptop(String address, String city, Owner owner) {
        this.description = address;
        this.brand = city;
        this.owner = owner;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
}
