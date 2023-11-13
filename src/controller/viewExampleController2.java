/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import model.Carrito;
import model.Compra;
import model.Juegos;

/**
 *
 * @author DAMIANA
 */
public class viewExampleController2 implements Initializable {

   
    
    
 
  //DECLARAMOS------------------------------------------------------------------
    
  
  
  @FXML 
  Button bcerrar;
  
  //CARRITO---------------------------------------------------------------------
  
    @FXML
    private Button agregarGodOfWar;
    @FXML
    private Button agregarUncharted;
    @FXML
    private Button agregarDeadSpace;
    @FXML
    private Button agregarGears5;
  
    //COMPRA--------------------------------------------------------------------
    
    @FXML
    private Button ComprarGodOfWar;
    @FXML
    private Button ComprarUncharted;
    @FXML
    private Button ComprarDeadSpace;
    @FXML
    private Button ComprarGears5;
    @FXML
    private Button  verBiblioteca;
    
    //JUEGO---------------------------------------------------------------------
    
    @FXML
    private Button BGodOfWar;
    
    @FXML
    private Button BUncharted;
    
    @FXML
    private Button BDeadSpace;
    
    @FXML
    private Button Gears5;

  //CARRITO Y COMPRA------------------------------------------------------------
    @FXML
    private Button verCarrito;
    
     private Carrito carrito = new Carrito();
     private Compra compra = new Compra();
     
     //BOTONES JUEGOS-----------------------------------------------------------
     
     @FXML
     public void BGodOfWar(ActionEvent event) throws IOException{
            
    if (compra.getProductosComprados().isEmpty()) {
      
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample3.fxml"));
    Parent root = loader.load();
    viewExampleController3 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
    
    } else {
      
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample4.fxml"));
    Parent root = loader.load();
    viewExampleController4 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
   }
   }
      @FXML
     public void BUncharted(ActionEvent event) throws IOException{
            
    if (compra.getProductosComprados().isEmpty()) {
      
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample5.fxml"));
    Parent root = loader.load();
    viewExampleController5 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
    
    } else {
      
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample6.fxml"));
    Parent root = loader.load();
    viewExampleController6 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
   }
   }
   
    @FXML
    public void BDeadSpace(ActionEvent event) throws IOException{
            
    if (compra.getProductosComprados().isEmpty()) {
      
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample7.fxml"));
    Parent root = loader.load();
    viewExampleController7 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
    
    } else {
      
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample8.fxml"));
    Parent root = loader.load();
    viewExampleController8 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
   }
   }
    @FXML
    public void Gears5(ActionEvent event) throws IOException{
           
    if (compra.getProductosComprados().isEmpty()) {
      
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample9.fxml"));
    Parent root = loader.load();
    viewExampleController9 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
    
    } else {
      
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewExample10.fxml"));
    Parent root = loader.load();
    viewExampleController10 controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
   }
   }  
  
     // FIN TONES JUEGOS--------------------------------------------------------
  
  // FIN DECLARACION------------------------------------------------------------
     
     //Asignar Compra-----------------------------------------------------------
     @FXML
    private void ComprarGodOfWar(ActionEvent event) {
    Juegos godOfWar = new Juegos("God of War", 59.99);
    if (compra.getCompra().contains(godOfWar)) {
        JOptionPane.showMessageDialog(null, "El producto ya lo has comprado");
        } else {
        if (carrito.getProductos().contains(godOfWar)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
    } else {
        compra.getCompra().push(godOfWar);
        JOptionPane.showMessageDialog(null, "Se ha comprado God of War con precio: " + godOfWar.getPrecio() + " Su producto se ha agregado a la biblioteca");

    
      
    }
}
    }


@FXML
private void ComprarUncharted(ActionEvent event) {
    Juegos uncharted = new Juegos("Uncharted", 49.99);
       if (compra.getProductosComprados().contains(uncharted)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
        } else {
        if (carrito.getProductos().contains(uncharted)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
        compra.getCompra().push(uncharted);
        JOptionPane.showMessageDialog(null, "Se ha comprado Uncharted 4 con precio: " + uncharted.getPrecio() + " Su producto se ha agregado a la biblioteca");
       }
     }
}

@FXML
private void ComprarDeadSpace(ActionEvent event) {
    Juegos deadSpace = new Juegos("Dead Space", 59.99);
         if (compra.getProductosComprados().contains(deadSpace)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
        } else {
        if (carrito.getProductos().contains(deadSpace)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
        compra.getCompra().push(deadSpace);
        JOptionPane.showMessageDialog(null, "Se ha comprado Dead Space con precio: " + deadSpace.getPrecio() + " Su producto se ha agregado a la biblioteca");
       }
     }
}

@FXML
private void ComprarGears5(ActionEvent event) {
    Juegos gears5 = new Juegos("Gears 5", 59.99);
          if (compra.getProductosComprados().contains(gears5)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
        } else {
        if (carrito.getProductos().contains(gears5)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
        compra.getCompra().push(gears5);
        JOptionPane.showMessageDialog(null, "Se ha comprado Gears 5 con precio: " + gears5.getPrecio() + " Su producto se ha agregado a la biblioteca");
       }
     }    
} 
     //Asignar Compra-----------------------------------------------------------
     
     
     //Asignar Carrito----------------------------------------------------------
     
      @FXML
    private void agregarGodOfWar(ActionEvent event) {
        Juegos godOfWar = new Juegos("God of War", 59.99);
        
        if (compra.getProductosComprados().contains(godOfWar)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
    } else {
        if (carrito.getProductos().contains(godOfWar)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
            carrito.agregarProducto(godOfWar);
            JOptionPane.showMessageDialog(null, "Se ha agregado God Of War al carrito, precio 59.99");
        }
    }
}

    @FXML
    private void agregarUncharted(ActionEvent event) {
        Juegos uncharted = new Juegos("Uncharted", 49.99);
        
        if (compra.getProductosComprados().contains(uncharted)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
    } else {
        if (carrito.getProductos().contains(uncharted)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
            carrito.agregarProducto(uncharted);
            JOptionPane.showMessageDialog(null, "Se ha agregado Uncharted 4 al carrito, precio 49.99");
        }
    }
}

    @FXML
    private void agregarDeadSpace(ActionEvent event) {
        Juegos deadSpace = new Juegos("Dead Space", 59.99);
        
    if (compra.getProductosComprados().contains(deadSpace)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
    } else {
        if (carrito.getProductos().contains(deadSpace)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
            carrito.agregarProducto(deadSpace);
            JOptionPane.showMessageDialog(null, "Se ha agregado Dead Space al carrito, precio 59.99");
        }
    }
}

    @FXML
    private void agregarGears5(ActionEvent event) {
        Juegos gears5 = new Juegos("Gears 5", 59.99);
        
       if (compra.getProductosComprados().contains(gears5)) {
        JOptionPane.showMessageDialog(null, "El juego ya ha sido comprado.");
    } else {
        if (carrito.getProductos().contains(gears5)) {
            JOptionPane.showMessageDialog(null, "El juego ya está en el carrito.");
        } else {
            carrito.agregarProducto(gears5);
            JOptionPane.showMessageDialog(null, "Se ha agregado Gears 5 al carrito, precio 59.99");
        }
    }
}
   
     //Fin Asignar carrito------------------------------------------------------
    
    //VER CARRITO
    public void verCarrito(ActionEvent event) {
     if (carrito.getProductos().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El carrito está vacío.", "Carrito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        StringBuilder mensaje = new StringBuilder("Productos en el carrito:\n");
        for (Juegos juego : carrito.getProductos()) {
            mensaje.append(juego.getNombre()).append(" - ").append(juego.getPrecio()).append("\n");
        }
        double total = carrito.calcularTotal();
        mensaje.append("\nTotal: ").append(total);

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Carrito", JOptionPane.INFORMATION_MESSAGE);

        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
                "Quiere comprar los elementos del carrito \n"+
                "1. Si \n"+
                "2. Quiero elminar los productos del carrito \n"+
                "3. Salir \n"+
                "Entre su opción: "           
            ));
            
           switch(op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Se han comprado los productos del carrito. Valor total: " + carrito.calcularTotal() + ". Los elementos se han agregado a la biblioteca");
                compra.transferirABiblioteca(carrito);
                break;
         
            case 2:
                JOptionPane.showMessageDialog(null, "Se han eliminado los productos del carrito");
                carrito.getProductos().clear();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Adios!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción invalida!!!");
        }
    } while(op != 3 );
}
    }  
    //FIN VER AL CARRITO
    
    //VER BIBLIOTECA
    public void verBiblioteca(ActionEvent event) {
        
         if (compra.getProductosComprados().isEmpty()) {
        JOptionPane.showMessageDialog(null, "La biblioteca esta vacía.", "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
    } else {
        StringBuilder mensaje = new StringBuilder("Productos en la biblioteca:\n");
        for (Juegos juego : compra.getProductosComprados()) {
            mensaje.append(juego.getNombre()).append("\n");
        }   
         JOptionPane.showMessageDialog(null, mensaje.toString(), "Carrito", JOptionPane.INFORMATION_MESSAGE);
      }
    }
    //FIN VER BIBLIOTECA
   
  @FXML 
  private void cerrar(ActionEvent event){
      System.exit(0);
   
        }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        

        
    }
        
    }    

   
