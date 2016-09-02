/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dprintme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * The FXMLDocumentController class contains the business logic of the 
 * application. Components and methods specified in the FXML GUI layout 
 * are injected into the controller using JavaFX FXML injection points.
 * 
 * @author Kieran Hannigan
 */
public class FXMLDocumentController implements Initializable {
    
    /* -----------------------------
     * FXML object injection points.
     * -----------------------------
     */
    
    @FXML
    private Label label;
    
    /* -----------------------------
     * FXML method injection points.
     * -----------------------------
     */    
    
    /**
     *
     * @param event 
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    /* -----------------------------
     * Non-injected class variables.
     * -----------------------------
     */
    
    
    
    /* ---------------------------
     * Non-injected class methods.
     * ---------------------------
     */
    
    /**
     * 
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
