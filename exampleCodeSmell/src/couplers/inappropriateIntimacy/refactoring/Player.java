/*
 * To change this shield header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couplers.inappropriateIntimacy.refactoring;

/**
 *
 * @author eduar
 */
public class Player {
    
    public Shield shield;
    private String nickName;
    private String life;

    public Player(Shield shield, String nickName, String life) {
        this.shield=shield;
        this.nickName = nickName;
        this.life = life;
    }

    public String getNickName() {
        return nickName;
    }

    public String getLife() {
        return life;
    }
    
    public String getInformation(Shield shield) {
        return this.getNickName() + " " + this.getLife() + ", " + Integer.toString(shield.getPoints()) + " points.";
    }
    
}
