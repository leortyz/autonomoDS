/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientationAbusers.switchStatements.codeSmell;

/**
 *
 * @author eduar
 */
public class Player {
    
    public String createPlayer(TypePlayer type){
         switch (type) {
      case WARRIOR:
         return "warrior player";
      case PALADIN:
         return "paladin player";
      case HUNTER:
         return "hunter player";
      case MAGICIAN:
          return "magician player";
      default:
         throw new IllegalArgumentException("Invalid player type: "+ type);
      }
   }
}
