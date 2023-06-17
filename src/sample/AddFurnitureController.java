/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import oracle.jdbc.driver.OracleDriver;

import javax.swing.*;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class AddFurnitureController implements Initializable {

    public TextField HIGHT;
    public Button addsalon;
    public Button addliving;
    public Button addkitchen;
    public Button addentrance;
    public Button addgarden;
    public ImageView CLOSE;
    public TextField PRICE;
    public BorderPane mainPane;
    public Button addbedroom;
    // public ImageView WOODTYPE;
    int flag = 0;
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void choose_photo (ActionEvent actionEvent){
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        //selectedFile = fileChooser.showOpenDialog(null);
        filename = f.getAbsolutePath();
        try {
            byte[] image = new byte[0];
            FileInputStream fis = new FileInputStream(String.valueOf(image));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1; ) {
                bos.write(buf, 0, readNum);
            }
            image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void browse(ActionEvent actionEvent) {
        choose_photo(actionEvent);
    }



    public void addsalon(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #26692b");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("addsalon");
        mainPane.setCenter(view);
        flag=1;
    }

    public void addliving(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #26692b");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("addliving");
        mainPane.setCenter(view);
        flag=2;
    }

    public void addkitchen(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");

        addkitchen.setStyle("-fx-background-color: #26692b");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("addkitchen");
        mainPane.setCenter(view);
        flag=3;
    }

    public void addgarden(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("addkitchen");
        mainPane.setCenter(view);
        flag=4;
    }

    public void addentrance(ActionEvent actionEvent) {
        //flag=5;
        addentrance.setStyle("-fx-background-color: #26692b");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("addentrance");
        mainPane.setCenter(view);

    }

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }


    public void addbedroom(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #26692b");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("addbedroom");
        mainPane.setCenter(view);
        flag=6;
    }

    public void BACK(MouseEvent mouseEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("furnitureEmployee.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
}
