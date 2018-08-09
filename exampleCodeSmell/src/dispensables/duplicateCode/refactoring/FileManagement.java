/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensables.duplicateCode.refactoring;

import java.io.File;

/**
 *
 * @author eduar
 */
public class FileManagement {
    private void management(File file, String mode, File newFile) {
        if (!file.exists()) {
            System.out.println("The data file does not exist.");
        } else {
            boolean action = false;
            if(mode.equalsIgnoreCase("delete")){
                action=file.delete();
            }
            else if(mode.equalsIgnoreCase("rename")){
                action=file.renameTo(newFile);
            }
            if(action){
                System.out.println("The data file was modified.");
            }
            else{
                System.out.println("The data file was not modified.");
            }
            
        }
    }
}
