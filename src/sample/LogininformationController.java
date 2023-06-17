/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.sql.Statement;

import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
//import java.awt.Color;
import java.sql.Connection;

import javafx.scene.paint.Color;
import oracle.jdbc.driver.OracleDriver;


/**
 * FXML Controller class
 *
 * @author dell
 */
public class LogininformationController implements Initializable {

    public TextField emailReg;
    public Button SUBMITREGBUTTON;
    public TextField phoneNumReg;
    public TextField nearToReg;
    public TextField streetReg;
    public TextField cityReg;
    public TextField countryReg;
    public TextField lastNameReg;
    public TextField firstNameReg;
    public PasswordField vPasswordReg;
    public PasswordField passwordReg;
    public Label RIGESTRATIONMASSAGE;
    public Label CONFIRMPASSWORD;
    public ImageView close;


    public void closex(MouseEvent mouseEvent) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    public void CANCELL(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("dd.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }



    public void CANCELREG(MouseEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("dd.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void SUBMITREG(ActionEvent actionEvent) throws Exception {
       // RIGESTRATIONMASSAGE.setText("user registered successfully!");
        if (passwordReg.getText().equals(vPasswordReg.getText()))
        {
            registerUser();
             CONFIRMPASSWORD.setText("password matched!");
           // RIGESTRATIONMASSAGE.setText("user registered successfully!");
            CONFIRMPASSWORD.setTextFill(Color.web("#2939ca", 0.8));
        }
        else
        {
            CONFIRMPASSWORD.setText(" password does not match!");
            CONFIRMPASSWORD.setTextFill(Color.web("#c90a0a", 0.8));
        }
        if(firstNameReg.getText().isEmpty()||lastNameReg.getText().isEmpty()||emailReg.getText().isEmpty()||countryReg.getText().isEmpty()||
                phoneNumReg.getText().isEmpty()||nearToReg.getText().isEmpty() ||streetReg.getText().isEmpty()||cityReg.getText().isEmpty()
        ||passwordReg.getText().isEmpty()||vPasswordReg.getText().isEmpty())
        {
            RIGESTRATIONMASSAGE.setText("you must fill all data!");
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c90a0a", 0.8));

        }

    }
    public void registerUser() throws Exception {
        String firstname=firstNameReg.getText();
        String lastname=lastNameReg.getText();
        String email=emailReg.getText();
        String phonenumber=phoneNumReg.getText();
        String pass=passwordReg.getText();
        String vpass=vPasswordReg.getText();
        String countryy=countryReg.getText();
        String cityy=cityReg.getText();
        String streett=streetReg.getText();
        String neartoo=nearToReg.getText();
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();
        String insert= " insert into userregistration(firstname,lastname,email,phonenumber,mypassword,vpassword,country,city,street,nearto) values ('"+firstname+"','"+lastname+"','"+email+"','"+phonenumber+
              "','"+pass+"','"+vpass+"','"+countryy+"','"+cityy
               +"','"+streett+"','"+neartoo+"')";
        String test2= " insert into logincoustomer (username,mypassword) values ('"+email+"','"+pass+"')" ;


        try {
            {
               // java.beans.Statement stmt = (Statement) con.createStatement();
                RIGESTRATIONMASSAGE.setText("user registered successfully!");
                CONFIRMPASSWORD.setTextFill(Color.web("#2939ca", 0.8));
                stmt.executeUpdate(insert);
                stmt.executeUpdate(test2);
                con.commit();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


}
