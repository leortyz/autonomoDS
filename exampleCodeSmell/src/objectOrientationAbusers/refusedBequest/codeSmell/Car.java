/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientationAbusers.refusedBequest.codeSmell;

/**
 *
 * @author eduar
 */
public class Car implements Transport {

    @Override
    public void turnOn() {
        System.out.println("Car turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Car turn off");    
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    public void fly() {
        System.out.println("Car fly");
    }

    @Override
    public void sails() {
        System.out.println("Car sails");
    }
    
}
