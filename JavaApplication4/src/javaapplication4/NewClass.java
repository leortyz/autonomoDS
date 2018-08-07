/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author eduar
 */
public class NewClass implements Comparable<String>{
    private String name;

    public NewClass() {
        this.name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(String t) {
        return this.name.compareToIgnoreCase(t);        
    }

    
    
}
