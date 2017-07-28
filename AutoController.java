/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.TextField;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Peña Robles
 */
public class AutoController implements Initializable {
    @FXML
    private javafx.scene.control.TextField km,precio, consumo;
    @FXML
    private AnchorPane menu;
    float com=0, pre=0;
    
    @FXML private void calcular(ActionEvent event) throws IOException{
        System.out.println("Accion Calcular");
         float kilometros = Float.parseFloat(km.getText());
         Auto consum = new Auto(kilometros);
        com = consum.consumoRecorrido();
        consumo.setText(""+com+ " litros");
        Auto preci = new Auto(kilometros);
        pre = preci.costoRecorrido();
        precio.setText("$"+pre);
    }
    
    @FXML
    private void guardar(ActionEvent event) {
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
    
     @FXML private void menu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
