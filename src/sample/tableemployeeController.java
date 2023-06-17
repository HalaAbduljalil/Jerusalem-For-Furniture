package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class tableemployeeController implements Initializable {
    @FXML
    private TableColumn<users, String> firstNameColumn;
    @FXML
    private TableColumn<users, String> lastNameColumn;
    @FXML
    private TableColumn<users, String>  emailColumn;
    @FXML
    private TableColumn<users, Integer>  passwordColumn;
    @FXML
    private TableColumn<users, String>  positionColumn;
    @FXML
    private TableColumn<users, Integer> salaryColumn;
    @FXML
    private TableColumn<users, String>  cityColumn;
    @FXML
    private TableColumn<users, String>  streetColumn;
    @FXML
    private TableView<users>employeeTable;
    @FXML
    private static TableView<users>employeeTable2;
    Connection con = null ;
    ResultSet rs= null;
    PreparedStatement pst=null;

    // String  firstname;
    ObservableList<users> listMh;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<users,String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<users,String>("lastName"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<users,String>("email"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<users,Integer>("password"));
        positionColumn.setCellValueFactory(new PropertyValueFactory<users,String>("position"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<users,Integer>("salary"));
        cityColumn.setCellValueFactory(new PropertyValueFactory<users,String>("city"));
        streetColumn.setCellValueFactory(new PropertyValueFactory<users,String>("street"));

        listMh = mySqlConn2.getDatausers3();
        employeeTable.setItems(listMh);
        employeeTable2=employeeTable;
    }
    public  static void delete()
    {
        ObservableList<users> allProduct;
        ObservableList<users> SinglProduct;
        allProduct = employeeTable2.getItems();
        SinglProduct = employeeTable2.getSelectionModel().getSelectedItems();
        SinglProduct.forEach(allProduct::remove);
    }
}
