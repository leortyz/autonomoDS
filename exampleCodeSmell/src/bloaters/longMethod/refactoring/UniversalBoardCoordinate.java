/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloaters.longMethod.refactoring;

/**
 *
 * @author eduar
 */
public class UniversalBoardCoordinate {

    int row;
    int column;

    public UniversalBoardCoordinate(String locationPhrase) throws Exception {
        String[] coordinates= coordinatesPair(locationPhrase);
        Integer[] orderedPair = parseCoordinates(coordinates);
        row = orderedPair[0];
        column = orderedPair[1];
    }
    
    private String[] coordinatesPair(String locationPhrase) throws Exception{
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");
        checkValidity(coordinates);
        return coordinates;
    
    }

    private Integer[] parseCoordinates(String[] coordinates) {
        return new Integer[]{Integer.parseInt(coordinates[0].trim()),
            Integer.parseInt(coordinates[1].trim())};
    }

    private void checkValidity(String[] coordinates) throws Exception {
        if (coordinates.length != 2) {
            throw new Exception("That's not a valid board location.");
        }
    }
}
