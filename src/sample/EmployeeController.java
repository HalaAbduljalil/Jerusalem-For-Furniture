/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class EmployeeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
     @FXML
     private void employee (java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }  
     @FXML
     private void customer (java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("Customer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }  
     @FXML
     private void home (java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }  
      @FXML
     private void exhibts (java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("exhibts.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    } 
       @FXML
     private void add (java.awt.event.ActionEvent evt) throws IOException {
           // TODO add your handling code here:
           Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("add.fxml"));
           Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
           Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
           s.setScene(custumer_scene);
           s.show();
       }

    public void home(ActionEvent actionEvent) {
    }

    public void employee(ActionEvent actionEvent) {
    }

    public void add(ActionEvent actionEvent) {
    }
}
