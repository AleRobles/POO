/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Peña Robles
 */
public class HisorialController implements Initializable {
    public void Auto(ActionEvent event){
        File archivo;
        try{
            archivo = new File("Auto.txt");
            if(archivo.exists()) {
                System.out.println("El archivo existe");
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("\r\nConsumo en litros "+ com );
                bw.write("\r\nPrecio: $" + pre);
                bw.close();
            } 
            if (archivo.createNewFile()){
                System.out.println("El archivo se ha crado");
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
               bw.write("\r\nConsumo en litros"+ com );
                bw.write("\r\nPrecio: $" + pre);
                bw.close();
            }
        } catch(Exception e){
            System.out.println("El archivo no se pudo crear");
        }
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
