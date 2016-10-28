/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_processbuilder;

import java.io.File;

public class Ejer_ProcessBuilder {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("CMD");
           
        File f_bat = new File("fichero.bat");
        File f_out = new File("salida.txt");
        File f_error = new File("error.txt");
        
        pb.redirectInput(f_bat);
        pb.redirectOutput(f_out);
        pb.redirectError(f_error);
        
        try{
            pb.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
