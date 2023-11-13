/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.Carrito;
import model.Compra;
import model.Juegos;



/**
 *
 * @author DAMIANA
 */
public class viewExampleController4 implements Initializable {
    
    @FXML
    Button Jugar;
    
    @FXML
    private void Bjugar (ActionEvent event){
        JOptionPane.showMessageDialog(null, "Iniciando Juego..."); 
    System.exit(0);
    }
    
  

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}