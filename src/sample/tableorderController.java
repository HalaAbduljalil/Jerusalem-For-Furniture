package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class tableorderController implements Initializable {

    @FXML
    private TableView<userorder> employeeTable;

    @FXML
    private TableColumn<userorder, String> firstNameColumn;

    @FXML
    private TableColumn<userorder, String> addresscolumn;

    @FXML
    private TableColumn<userorder, String> ordercolumn;

    @FXML
    private TableColumn<userorder, String>emailColumn;

    @FXML
    private TableColumn<userorder, String>paymentmethodcolumn;
    ObservableList<userorder> listM ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<userorder,String>("name"));
        addresscolumn.setCellValueFactory(new PropertyValueFactory<userorder,String>("address"));
        ordercolumn.setCellValueFactory(new PropertyValueFactory<userorder,String>("orderno"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<userorder,String>("email"));
        paymentmethodcolumn.setCellValueFactory(new PropertyValueFactory<userorder,String>("paymentmethod"));
        listM = mySqlConn2.getDatausers8();
        employeeTable.setItems(listM);
    }
}
