/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couplers.inappropriateIntimacy.codeSmell;

/**
 *
 * @author eduar
 */
public class Player {
    
    public Shield shield;
    private String nickName;
    private String life;

    public Player(Shield license, String title, String life) {
        this.shield.setPlayer(this);
        this.nickName = title;
        this.life = life;
    }

    public String getNickName() {
        return nickName;
    }

    public String getLife() {
        return life;
    }

    public int getPosibbleBreak(){
        if(shield.getPoints()>3)
            return 10;
        else if(shield.getPoints()>0)
            return 5;
        else
            return 0;
    }
    
}
