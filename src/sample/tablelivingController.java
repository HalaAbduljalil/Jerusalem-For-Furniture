package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class tablelivingController implements Initializable {
    @FXML
    private TableView<userliving>  LIVINGTABLE;
    @FXML
    private  static TableView<userliving> LIVINGTABLE2;
    @FXML
    private TableColumn<userliving, String>  woodcolumn;
    @FXML
    private TableColumn<userliving, String> framscolumn;
    @FXML
    private TableColumn<userliving, String> furniturecolumn;
    @FXML
    private TableColumn<userliving, Integer> seatscolumn;
    @FXML
    private TableColumn<userliving, String> widthcolumn;
    @FXML
    private TableColumn<userliving, String> hightcolumn;
    @FXML
    private TableColumn<userliving, Integer> accessorizingcolumn;
    @FXML
    private TableColumn<userliving, String> pricecolumn;
    ObservableList<userliving> listM ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        woodcolumn.setCellValueFactory(new PropertyValueFactory<userliving,String>("woodcolumn"));
        framscolumn.setCellValueFactory(new PropertyValueFactory<userliving,String>("framscolumn"));
        furniturecolumn.setCellValueFactory(new PropertyValueFactory<userliving,String>("furniturecolumn"));
        widthcolumn.setCellValueFactory(new PropertyValueFactory<userliving,String>("widthcolumn"));
        hightcolumn.setCellValueFactory(new PropertyValueFactory<userliving,String>("hightcolumn"));
        pricecolumn.setCellValueFactory(new PropertyValueFactory<userliving,String>("pricecolumn"));
        accessorizingcolumn.setCellValueFactory(new PropertyValueFactory<userliving,Integer>("accessorizingcolumn"));
        seatscolumn.setCellValueFactory(new PropertyValueFactory<userliving,Integer>("seatscolumn"));
        listM = mySqlConn2.getDatausers6();
        LIVINGTABLE.setItems(listM);
        LIVINGTABLE2=LIVINGTABLE;
    }
    public  static void delete()
    {
        ObservableList<userliving> allProduct;
        ObservableList<userliving> SinglProduct;
        allProduct = LIVINGTABLE2.getItems();
        SinglProduct = LIVINGTABLE2.getSelectionModel().getSelectedItems();
        SinglProduct.forEach(allProduct::remove);
    }
}
