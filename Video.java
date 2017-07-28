/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.BorderLayout;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JFrame;

/**
 * FXML Controller class
 *
 * @author Peña Robles
 */
public class Video extends javax.swing.JFrame {
    
    private final JFXPanel jfxPanel = new JFXPanel();
    private final JFrame jPanel1 = new JFrame();
    
    /**
     * Creates new form JFrameVideo
     */
    public Video() {
        //initComponents();
        createScene();
        
        //setTitle("Java Swing Video con FX");
        setResizable(false);
        setLocationRelativeTo(null);
        //Añadimos el panel de JavaFX al JPanel Swing
        jPanel1.setSize(640,380);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel,BorderLayout.CENTER);
        jPanel1.setVisible(true);
    }
    
    private void createScene(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                File file = new File("/aaaaaa.wmv");
                MediaPlayer oracleVid = new MediaPlayer(new Media(file.toURI().toString()));
                //se añade video al jfxPanel
                jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));
                oracleVid.setVolume(0.7);//volumen
                oracleVid.setCycleCount(MediaPlayer.INDEFINITE);//repite video
                oracleVid.play();//play video
            }
        });
    }
}