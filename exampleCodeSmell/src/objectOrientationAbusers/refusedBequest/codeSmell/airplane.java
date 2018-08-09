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
public class airplane implements Transport {

    @Override
    public void turnOn() {
        System.out.println("airplane turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("airplane turn off");
    }

    @Override
    public void accelerate() {
        System.out.println("airplane accelerate");
    }

    @Override
    public void fly() {
        System.out.println("airplane fly");
    }

    @Override
    public void sails() {
        System.out.println("airplane sails");
    }
}
