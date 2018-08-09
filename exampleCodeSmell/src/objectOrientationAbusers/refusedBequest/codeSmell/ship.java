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
public class ship implements Transport {

    @Override
    public void turnOn() {
        System.out.println("Ship turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Ship turn off");
    }

    @Override
    public void accelerate() {
        System.out.println("Ship accelerate");
    }

    @Override
    public void fly() {
        System.out.println("Ship fly");
    }

    @Override
    public void sails() {
        System.out.println("Ship sails");
    }
}
