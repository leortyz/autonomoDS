/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couplers.inappropriateIntimacy.refactoring;

/**
 *
 * @author eduar
 */
public class Shield {
    
    private int points=0;
    
    public void addPoints(int points){
        this.points+=points;
    }
    
    public int getPoints(){
        return this.points;
    }

    public int getPosibbleBreak() {
        if (getPoints() > 3)
            return 10;
        else if (getPoints() > 0)
            return 5;
        else
            return 0;
    }
    
}
