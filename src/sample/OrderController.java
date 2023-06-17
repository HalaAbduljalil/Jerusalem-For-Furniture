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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class OrderController implements Initializable {

    public ImageView CLOSE;
    public BorderPane mainPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage10("cardbedroom");
        mainPane.setTop(view);

        homeEmptest object1 = new homeEmptest();
        Pane view1 = object1.getPage10("cardbedroom");
        mainPane.setCenter(view1);

        homeEmptest object2 = new homeEmptest();
        Pane view2 = object2.getPage10("cardbedroom");
        mainPane.setBottom(view2);
        homeEmptest object4 = new homeEmptest();
        Pane view4 = object4.getPage10("cardbedroom");
        mainPane.setBottom(view4);
        // TODO
    }
    @FXML
    private void homec(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("coustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
    @FXML
    private void orderc(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("order.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    @FXML
    private void love(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("love.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
    @FXML
    private void rate(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("rating.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
    public void love(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("love.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void rate(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("rating.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show(); }



    public void orderc(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("order.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void homec(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("coustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("dd.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void exhibits(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("ExhibtsCoustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void CLOSE(MouseEvent mouseEvent) {
    }
}
