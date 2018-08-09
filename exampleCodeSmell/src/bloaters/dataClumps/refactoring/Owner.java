/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.dataClumps.refactoring;

/**
 *
 * @author eduar
 */
public class Owner {
    private String name;
    private String phone;
    private String mail;
    private String personalNumber;

    public Owner(String name, String phone, String mail, String personalNumber) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }
    
    
    
}
