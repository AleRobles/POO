/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *Materia Programacion Orientada a Objetos
 * Monica Alejandra Peña Robles
 * @version alpha 1.0
 * @author Peña Robles
 */

public class FXMLDocumentController implements Initializable {
    @FXML private AnchorPane menuVideo;
    @FXML private MediaView visualizarVideo;
    MediaPlayer player;
    @FXML private Label label;
    
    @FXML private void video(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("video.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
      
    }
    
    @FXML private void motocilcista(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("motociclista.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML private void tren(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tren.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML private void barco(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("barco.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML private void auto(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("auto.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML private void autobus(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("autobus.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML private void historial(ActionEvent event) throws IOException {
        File archivo;
        try{
            archivo = new File("Historial.txt");
            if(archivo.exists()) {
                System.out.println("El archivo existe");
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("\r\nConsumo en litros " );
                bw.write("\r\nPrecio: $");
                bw.close();
            } 
            if (archivo.createNewFile()){
                System.out.println("El archivo se ha crado");
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
               bw.write("\r\nConsumo en litros" );
                bw.write("\r\nPrecio: $"  );
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
