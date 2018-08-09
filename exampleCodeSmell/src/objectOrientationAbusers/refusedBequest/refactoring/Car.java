/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientationAbusers.refusedBequest.refactoring;


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
    
}
