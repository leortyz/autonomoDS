/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientationAbusers.switchStatements.refactoring;


/**
 *
 * @author eduar
 */
public enum TypePlayer {
    
     WARRIOR {
   public String createPlayer() {
      return "warrior player";
   }
    },
    PALADIN {
       public String createPlayer() {
          return "paladin player";
       }
    },
    HUNTER {
          public String createPlayer() {
             return "hunter player";
          }
       },
    MAGICIAN {
          public String createPlayer() {
             return "magician player";
          }
       };
    
}
