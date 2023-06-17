package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class tablesalonController implements Initializable {
    @FXML
    private  TableView<userssalon> SALONTABLE;
    @FXML
    private  static TableView<userssalon> SALONTABLE2;
    //
   // @FXML
   // private TableView<userssalon> ENTRANCETABLE;
    @FXML
    private TableColumn<userssalon, String>  woodcolumn;
    @FXML
    private TableColumn<userssalon, String> fabriccolumn;
    @FXML
    private TableColumn<userssalon, String> furniturecolumn;
    @FXML
    private TableColumn<userssalon, Integer>seatscolumn;
    @FXML
    private TableColumn<userssalon, String> tablesizecolumn;
    @FXML
    private TableColumn<userssalon, String> carbitcolumn;
    @FXML
    private TableColumn<userssalon, Integer> accessorizingcolumn;
    @FXML
    private TableColumn<userssalon, String> curtianscolumn;
    @FXML
    private TableColumn<userssalon, Integer> pricecoulmn;
    ObservableList<userssalon> listM ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        woodcolumn.setCellValueFactory(new PropertyValueFactory<userssalon,String>("woodtype"));
        fabriccolumn.setCellValueFactory(new PropertyValueFactory<userssalon,String>("fabrictype"));
        furniturecolumn.setCellValueFactory(new PropertyValueFactory<userssalon,String>("furniturecolor"));
        seatscolumn.setCellValueFactory(new PropertyValueFactory<userssalon,Integer>("numofseats"));
        tablesizecolumn.setCellValueFactory(new PropertyValueFactory<userssalon,String>("tablesize"));
        carbitcolumn.setCellValueFactory(new PropertyValueFactory<userssalon,String>("carbitcolor"));
        accessorizingcolumn.setCellValueFactory(new PropertyValueFactory<userssalon,Integer>("numofaccessorizing"));
        curtianscolumn.setCellValueFactory(new PropertyValueFactory<userssalon,String>("curtainscolor"));
        pricecoulmn.setCellValueFactory(new PropertyValueFactory<userssalon,Integer>("price"));


        listM = mySqlConn2.getDatausers4();
        SALONTABLE.setItems(listM);
        SALONTABLE2=SALONTABLE;

    }
    public  static void delete()
    {
        ObservableList<userssalon> allProduct;
        ObservableList<userssalon> SinglProduct;
        allProduct = SALONTABLE2.getItems();
        SinglProduct = SALONTABLE2.getSelectionModel().getSelectedItems();
        SinglProduct.forEach(allProduct::remove);
    }
}
