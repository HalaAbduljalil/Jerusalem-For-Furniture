/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
//import java.beans.Statement;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import oracle.jdbc.driver.OracleDriver;
import oracle.jdbc.pool.OracleDataSource;
import utils.ConnectionUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class DdController implements Initializable {


    public Button LOGINBUTTON;
    public Label LOGINMASSAGE;
    public PasswordField PASSWORD;
    public ImageView CLOSE;
    @FXML
    private TextField USERNAME;
    @FXML
    private Label lb1_error;

    private Object PreparedStatement;

    /**
     * Initializes the controller class.
     */
    int flag = 0;

    public void validateLogin() {
        LoginConnection connectNow = new LoginConnection();
        Connection connectDB = connectNow.getConnect();
        String verifyLogin = "SELECT count(1) FROM logindata where username = '" + USERNAME.getText() + "' AND mypassword ='" + PASSWORD.getText() + "'";
        String verifyLogin2 = "SELECT count(1) FROM logincoustomer where username = '" + USERNAME.getText() + "' AND mypassword ='" + PASSWORD.getText() + "'";

        try {
            Statement statement = (Statement) connectDB.createStatement();
            ResultSet queryResult = ((java.sql.Statement) statement).executeQuery(verifyLogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    LOGINMASSAGE.setText("congratulations!");
                    createAccountForm();
                } else {
                    LOGINMASSAGE.setText("invalid login!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        try {
            Statement statement = (Statement) connectDB.createStatement();
            ResultSet queryResult = ((java.sql.Statement) statement).executeQuery(verifyLogin2);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    LOGINMASSAGE.setText("congratulations!");
                    createAccountForm2();
                } else {
                    LOGINMASSAGE.setText("invalid login!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void createAccountForm() {
        try {
            flag = 1;
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void createAccountForm2() {
        try {
            flag = 2;
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void LOGINBUTTONHANDLE(ActionEvent actionEvent) throws IOException {
        if ((!USERNAME.getText().isBlank()) && (!PASSWORD.getText().isBlank())) {
            validateLogin();
        } else
            LOGINMASSAGE.setText("please fill your name and password!");

     if(flag==1)
     {
         Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("homeemployee.fxml"));
         Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
         Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
         s.setScene(custumer_scene);
         s.show();

    }
        if(flag==2)
        {
            Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("coustomer.fxml"));
            Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
            Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            s.setScene(custumer_scene);
            s.show();

        }

}
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }


    public void registernow(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("login-information.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    @FXML


    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    private void login() throws SQLException {
        String email = USERNAME.getText().toString();
        String password = PASSWORD.getText().toString();
        String sql = "select * from costomer where email= ? and password =? ";
        try {
            PreparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                lb1_error.setText(String.valueOf(Color.RED));
                lb1_error.setText("Enter correct email or password ..");
            } else
                lb1_error.setText(String.valueOf(Color.green));
            lb1_error.setText("login successfull");


        } catch (Exception ex) {

        }

    }

    public DdController() {
        con = ConnectionUtil.conDB();
    }

    private void showDialog(String info, String header, String title) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(info);
        alert.setContentText(header);
        alert.showAndWait();
    }





    public void PASSWORD(ActionEvent actionEvent) {
    }

    public void USERNAME(ActionEvent actionEvent) {
    }


    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }

    public void registernow(ActionEvent evt) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("login-information.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();

    }
}