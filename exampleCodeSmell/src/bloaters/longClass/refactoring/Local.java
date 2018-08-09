/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.longClass.refactoring;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Local {
    private String address;
    private String city;
    private int totalSale;
    private List<String> stockProducts;
    private HashMap<String,Integer> products;

    public Local(String address, String city, int sale) {
        this.address = address;
        this.city = city;
        this.totalSale = sale;
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

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
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
    
    
    
}
