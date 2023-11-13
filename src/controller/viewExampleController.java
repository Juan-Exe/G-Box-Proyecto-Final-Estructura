/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
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


/**
 *
 * @author DAMIANA
 */
public class viewExampleController implements Initializable {
    
  //DECLARAMOS------------------------------------------------------------------ 
    
  @FXML
  TextField IngreseUsuario;
  
  @FXML
  TextField IngreseContraseña;
  
  @FXML 
  Button BIngresar;
  
  // FIN DECLARACION------------------------------------------------------------
  
  //VALIDACIONES________________________________________________________________
  
  @FXML
  private void eventKey(KeyEvent event){
      
      Object evt = event.getSource();
      
      if (evt.equals(IngreseUsuario)){
          if(event.getCharacter().equals(" ")){
              event.consume();
          }
      }
      
         if (evt.equals(IngreseContraseña)){
          if(event.getCharacter().equals(" ")){
              event.consume();
          }
      }
      
      
      
  }
  // FIN VALIDACIONES___________________________________________________________
  
  @FXML 
  private void Ingresar(ActionEvent event) throws IOException{
      
        String usuario = IngreseUsuario.getText();
        String contrasena = IngreseContraseña.getText();

        // Aquí puedes poner las credenciales correctas para el login
        String usuarioCorrecto = "Ruben_Baena";
        String contrasenaCorrecta = "12345";

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            
            
            JOptionPane.showMessageDialog(null, "Ingreso exitoso!");
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample2.fxml"));
             Parent root = loader.load();
             viewExampleController2 controller = loader.getController();
             Scene scene = new Scene(root);
             Stage stage = new Stage();
             stage.setScene(scene);
             stage.show();
             
             Stage currentStage = (Stage) BIngresar.getScene().getWindow();
             
        currentStage.close();
             


            
        } else {
            
            
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Por favor, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      


  
  
  
  
  
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO      
        
    }    
    
}
