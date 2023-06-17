package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class tablekitchenController implements Initializable {
    @FXML
    private TableView<userkitchen>  KITCHENTABLE;
    @FXML
    private  static TableView<userkitchen> KITCHENTABLE2;
    @FXML
    private TableColumn<userkitchen, String>  woodcolumn;
    @FXML
    private TableColumn<userkitchen, String> marblecolumn;
    @FXML
    private TableColumn<userkitchen, String>  colorcolumn;
    @FXML
    private TableColumn<userkitchen, Integer>  numshelvescolumn;
    @FXML
    private TableColumn<userkitchen, String> widthcolumn;
    @FXML
    private TableColumn<userkitchen, String>  hightcolumn;
    @FXML
    private TableColumn<userkitchen, String>  electricalcolumn;
    @FXML
    private TableColumn<userkitchen, String>  pricecolumn;
    ObservableList<userkitchen> listM ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        woodcolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("woodcolumn"));
        marblecolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("marblecolumn"));
        colorcolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("colorcolumn"));
        numshelvescolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,Integer>("numshelvescolumn"));
        hightcolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("hightcolumn"));
        widthcolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("widthcolumn"));
        electricalcolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("electricalcolumn"));
        pricecolumn.setCellValueFactory(new PropertyValueFactory<userkitchen,String>("pricecolumn"));
        listM = mySqlConn2.getDatausers5();
        KITCHENTABLE.setItems(listM);
        KITCHENTABLE2=KITCHENTABLE;

    }
    public  static void delete()
    {
        ObservableList<userkitchen> allProduct;
        ObservableList<userkitchen> SinglProduct;
        allProduct = KITCHENTABLE2.getItems();
        SinglProduct = KITCHENTABLE2.getSelectionModel().getSelectedItems();
        SinglProduct.forEach(allProduct::remove);
    }
}
