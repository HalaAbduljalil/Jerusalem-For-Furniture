package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class tableentranceController implements Initializable {
    @FXML
    private TableColumn<users2, String> mirrorcolumn;
    @FXML
    private TableColumn<users2, String> doorcolumn;
    @FXML
    private TableColumn<users2, String> carbitcolumn;
    @FXML
    private TableColumn<users2, String> pricecoulomn;

    @FXML
    private TableColumn<users2, String> hightcolumn;
    @FXML
    private TableColumn<users2, String> widthcoulmn;
    @FXML
    private TableColumn<users2, String> framscolumn;
    @FXML
    private TableColumn<users2, String> chandeliercolumn;
    @FXML
    private TableView<users2> ENTRANCETABLE;
    @FXML
    private  static TableView<users2> ENTRANCETABLE2;
    Connection con = null ;
    ResultSet rs= null;
    PreparedStatement pst=null;
   
    // String  firstname;
    ObservableList<users2> listM ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    //public users2(String door, String mirror, String carbit,String price,String hight, String width, String numfranes, String chandelier ) {


        doorcolumn.setCellValueFactory(new PropertyValueFactory<users2,String>("door"));
        mirrorcolumn.setCellValueFactory(new PropertyValueFactory<users2,String>("mirror"));
        carbitcolumn.setCellValueFactory(new PropertyValueFactory<users2,String>("carbit"));
        pricecoulomn.setCellValueFactory(new PropertyValueFactory<users2,String>("price"));
        hightcolumn.setCellValueFactory(new PropertyValueFactory<users2,String>("hight"));
        widthcoulmn.setCellValueFactory(new PropertyValueFactory<users2,String>("width"));
        framscolumn.setCellValueFactory(new PropertyValueFactory<users2,String>("numfranes"));
        chandeliercolumn.setCellValueFactory(new PropertyValueFactory<users2,String>("chandelier"));

        listM = mySqlConn2.getDatausers2();
        ENTRANCETABLE.setItems(listM);
        ENTRANCETABLE2=ENTRANCETABLE;
    }

    public  static void delete()
    {
        ObservableList<users2> allProduct;
        ObservableList<users2> SinglProduct;
        allProduct = ENTRANCETABLE2.getItems();
        SinglProduct = ENTRANCETABLE2.getSelectionModel().getSelectedItems();
        SinglProduct.forEach(allProduct::remove);
    }
}
