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
public class Shield {
    
    private Player player;
    private int points=0;
    
    public void setPlayer(Player player){
        this.player=player;
    }
    
    public void addPoints(int points){
        this.points+=points;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public String getInformation(){
        return player.getNickName() + " " + player.getLife() + ", " + Integer.toString(this.points) + " points.";
    }
    
}
