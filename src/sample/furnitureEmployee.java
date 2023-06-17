package sample;

//import groovy.util.ObservableList;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class furnitureEmployee implements Initializable {
    public BorderPane mainPane;
    public Button addentrance;
    public Button addgarden;
    public Button addkitchen;
    public Button addliving;
    public Button addsalon;
    public Button addbedroom;
    int flag =0;

    public void add(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("addFurniture.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("homeemployee.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
    }

    public void delete(ActionEvent actionEvent) {
        if (flag==1) {
            tablesalonController.delete();
        }
        if (flag==2) {
            tablelivingController.delete();
        }
        if (flag==3) {
            tablekitchenController.delete();
        }
        if (flag==4) {
            tablesalonController.delete();
        }
        if (flag==5) {
            tableentranceController.delete();
        }
        if (flag==6) {
            tablebedroomController.delete();
        }




    }

    public void update(ActionEvent actionEvent) {
    }

    public void addsalon(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");

        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #26692b");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage4("tablesalon");
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
        Pane view = object.getPage4("tableliving");
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
        Pane view = object.getPage4("tablekitchen");
        mainPane.setCenter(view);
        flag=3;
    }



    public void addentrance(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #26692b");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #E65100");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage4("tableentrance");
        mainPane.setCenter(view);
        flag=5;
    }

    public void addbedroom(ActionEvent actionEvent) {
        addentrance.setStyle("-fx-background-color: #E65100");
        addkitchen.setStyle("-fx-background-color: #E65100");
        addliving.setStyle("-fx-background-color: #E65100");
        addsalon.setStyle("-fx-background-color: #E65100");
        addbedroom.setStyle("-fx-background-color: #26692b");
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage4("tablebedroom");
        mainPane.setCenter(view);
        flag=6;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
