/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensables.duplicateCode.codeSmell;

import java.io.File;

/**
 *
 * @author eduar
 */
public class FileManagement {
    
    private void deleteFile(File file) {
        if (!file.exists()) {
            System.out.println("The data file does not exist.");
        } else {
            boolean eliminar=file.delete();
            System.out.println(eliminar);
            System.out.println("The data file was deleted.");
        }
    }
    
    private void remameFile(File file, File newFile){
        if(!file.exists()) {
            System.out.println("The data file does not exist.");
        } else {
            boolean renombrar=file.renameTo(newFile);
            System.out.println(renombrar);
            System.out.println("The data file was modified.");
        }
    }
}
