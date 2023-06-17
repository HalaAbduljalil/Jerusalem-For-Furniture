package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Homeemployee {


    public ImageView CLOSE;
    public BorderPane mainPane;

    public void logout(ActionEvent actionEvent) throws IOException {

        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("dd.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);


    }


    public void ADD_FURNITURE(ActionEvent actionEvent) throws IOException {

        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("furnitureEmployee.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);

    }

    public void ORDERS(ActionEvent actionEvent) throws IOException {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage("tableorder");
        mainPane.setCenter(view);
    }






        public void CLOSE (MouseEvent mouseEvent){
            Stage stage = (Stage) CLOSE.getScene().getWindow();
            stage.close();
        }

        public void ADD_EMPLOYEE (ActionEvent actionEvent) throws IOException {

            Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("addingEmployeeTable.fxml"));
            Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
            Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            s.setScene(custumer_scene);
        }
    }

