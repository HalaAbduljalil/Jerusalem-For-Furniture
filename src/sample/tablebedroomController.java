package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class tablebedroomController implements Initializable {
    @FXML
    private TableColumn<userbedroom, String> IDCOLUMN1;
    @FXML
private TableView<userbedroom>  BEDROOMTABLE;
    @FXML
    private  static TableView<userbedroom> BEDROOMTABLE2;
    @FXML
    private TableColumn<userbedroom, String>  areacolumn;
    @FXML
    private TableColumn<userbedroom, String>  framescolumn;
    @FXML
    private TableColumn<userbedroom, String> carbitcolumn;
    @FXML
    private TableColumn<userbedroom, String>  closetcolumn;
    @FXML
    private TableColumn<userbedroom, String>  curtainscolumn;
    @FXML
    private TableColumn<userbedroom, String>  bidcolorcolumn;
    @FXML
    private TableColumn<userbedroom, Integer>  lightscolumn;
    @FXML
    private TableColumn<userbedroom, String>  bedsizecolumn;
    @FXML
    private TableColumn<userbedroom, String>  pricecoulmn;
    ObservableList<userbedroom> listM ;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        areacolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("area"));
        framescolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("frames"));
        carbitcolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("carbit"));
        closetcolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("closet"));
        curtainscolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("curtains"));
        bidcolorcolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("bidcolor"));
        lightscolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,Integer>("lights"));
        bedsizecolumn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("bedsize"));
        pricecoulmn.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("price"));
        IDCOLUMN1.setCellValueFactory(new PropertyValueFactory<userbedroom,String>("id"));
        listM = mySqlConnectbedroom.getDatausers7();
        BEDROOMTABLE.setItems(listM);
        BEDROOMTABLE2=BEDROOMTABLE;

    }
    public  static void delete()
    {
        ObservableList<userbedroom> allProduct;
        ObservableList<userbedroom> SinglProduct;
        allProduct = BEDROOMTABLE2.getItems();
        SinglProduct = BEDROOMTABLE2.getSelectionModel().getSelectedItems();
        SinglProduct.forEach(allProduct::remove);
    }
}

