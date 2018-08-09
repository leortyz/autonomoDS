/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changePreventers.shotgunSurgery.refactoring;


/**
 *
 * @author eduar
 */
public class PlayerLife {
    
    private String playerZone;
    private String idPlayer;
    private int percentLife;

    public PlayerLife(String playerZone, String idPlayer, int amount) {
        this.playerZone = playerZone;
        this.idPlayer = idPlayer;
        this.percentLife = amount;
    }
    private boolean justAboutToDie(){
        return 25>=percentLife;
    }
    
    public void notification(){
        if(justAboutToDie()){
            System.out.println("Life over 25 percent");
        }
    }
    
    public void shotgun(int shot) throws Exception{
        if(justAboutToDie()){
            throw new Exception("Life over 25 percent");
        }
        percentLife = percentLife-shot;
        System.out.println("Your life is" + percentLife);
    }
      
    public void help(PlayerLife playerOne, PlayerLife playerTwo,int percentLife) throws Exception{
        if(justAboutToDie()){
            throw new Exception("Life over 25 percent");
        }
        playerTwo.percentLife += percentLife;
        playerOne.percentLife -= percentLife;
    }
    
    
}
