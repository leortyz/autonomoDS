/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.longClass.codeSmell;

import java.util.HashMap;
import java.util.List;


/**
 *
 * @author eduar
 */
public class Local {
    private String address;
    private String city;
    private int sale;
    private List<String> stockProducts;
    private HashMap<String,Integer> products;
    private String ownerName;
    private String ownerPhone;
    private String ownerMail;
    private String ownerPersonalNumber;

    public Local(String address, String city, int sale, List<String> stockProducts, String ownerName, String ownerPhone, String ownerMail, String ownerPersonalNumber) {
        this.address = address;
        this.city = city;
        this.sale = sale;
        this.stockProducts = stockProducts;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.ownerMail = ownerMail;
        this.ownerPersonalNumber = ownerPersonalNumber;
    }

        
    public void productPrice(String product, HashMap<String,Integer> products){
        //do something
    }
    
    public void totalSalePrice(List<String> purchaseProducts,HashMap<String,Integer> products){
        //do something
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

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public List<String> getStockProducts() {
        return stockProducts;
    }

    public void setStockProducts(List<String> stockProducts) {
        this.stockProducts = stockProducts;
    }

    public HashMap<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, Integer> products) {
        this.products = products;
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
