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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class SalonController implements Initializable {

    public ImageView CLOSE;
    public ImageView SEEMORE;
    public ImageView PUTLOVE;
    public ImageView BUYIT;
    public HBox HBOX1;
    public ImageView refresh;
    public HBox hboxyy;
    int  flag = 1;
int count =0;



    public void SEEMORE(MouseEvent mouseEvent) {
    }

    public void PUTLOVE(MouseEvent mouseEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("massagelove.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();
    }

    public void BUYIT(MouseEvent mouseEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("ordernow.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();
    }

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("EXhibtsCoustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();

    }

  

    public void refresh(MouseEvent mouseEvent) {
        hboxyy.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hboxyy.setVisible(false);
    }
}
