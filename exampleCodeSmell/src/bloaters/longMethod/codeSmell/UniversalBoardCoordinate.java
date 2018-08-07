/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.longMethod.codeSmell;

/**
 *
 * @author eduar
 */
public class UniversalBoardCoordinate {

    int row;
    int column;

    public UniversalBoardCoordinate(String locationPhrase) throws Exception {
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");

        if (coordinates.length != 2) {
            throw new Exception("That's not a valid board location.");
        }

        row = Integer.parseInt(coordinates[0].trim());
        column = Integer.parseInt(coordinates[1].trim());
    }
    
    
}
