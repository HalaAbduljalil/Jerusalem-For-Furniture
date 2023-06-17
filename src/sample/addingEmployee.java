package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class addingEmployee  {
    public BorderPane mainPane;

    public ImageView CLOSE;

   int index = -1 ;
      Connection con = null ;
      ResultSet rs= null;
    PreparedStatement pst=null;



    public void update(ActionEvent actionEvent) {
    }

    public void delete(ActionEvent actionEvent) {
        tableemployeeController.delete();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("homeemployee.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
    }

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }



    public void viewtable(ActionEvent actionEvent) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage3("tableemployee");
        mainPane.setCenter(view);
    }

    public void addnewemp(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("addemployee.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();

    }
}

