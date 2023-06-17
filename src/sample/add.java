package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import oracle.jdbc.driver.OracleDriver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class add {
    public CheckBox CHECK;
    public TextField STREET;
    public TextField CITY;
    public Label CONFIRMPASSWORD;
    public Label RIGESTRATIONMASSAGE;
    public TextField FIRSTNAME;
    public TextField PASSWORD;
    public TextField VPASSWORD;
    public TextField SALARY;
    public TextField EMAIL;
    public TextField POSITION;
    public TextField LASTNAME;
    public ImageView close;

    public void ADD(ActionEvent actionEvent) throws Exception {
        if ((PASSWORD.getText().equals(VPASSWORD.getText()))&&(!(PASSWORD.getText().isEmpty())&&!(VPASSWORD.getText().isEmpty())))
        {
            registerUser();
            CONFIRMPASSWORD.setText("password matched!");
            // RIGESTRATIONMASSAGE.setText("user registered successfully!");
            CONFIRMPASSWORD.setTextFill(Color.web("#1828d7", 0.8));
        }
        else
        {
            CONFIRMPASSWORD.setText(" password does not match!");
            CONFIRMPASSWORD.setTextFill(Color.web("#e22020", 0.8));
        }
        if(STREET.getText().isEmpty()||CITY.getText().isEmpty()||FIRSTNAME.getText().isEmpty()||SALARY.getText().isEmpty()||EMAIL.getText().isEmpty()||
                POSITION.getText().isEmpty() ||LASTNAME.getText().isEmpty()  )
        {
            RIGESTRATIONMASSAGE.setText("you must fill all data!");
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#e22020", 0.8));

        }
    }
    public void registerUser() throws Exception {

        String firstname=FIRSTNAME.getText();
        String streetText=STREET.getText();
        String cityText=CITY.getText();
        String passwordText=PASSWORD.getText();
        String salaryText=SALARY.getText();
        String emailText=EMAIL.getText();
        String positionText=POSITION.getText();
        String lastname=LASTNAME.getText();

        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();

        String insert= " insert into employee1(firstName,lastName,email,passwordd,positionn,salary,city,street) values" +
                " ('"+firstname+"','"+lastname+"','"+emailText+"','"+passwordText+
                "','"+positionText+"','"+salaryText+"','"+cityText+"','"+streetText +"')";
        String test2= " insert into logindata (username,mypassword) values ('"+emailText+"','"+passwordText+"')" ;
        String test3= " insert into logincoustomer (username,mypassword) values ('"+emailText+"','"+passwordText+"')" ;



        try {
            {

                RIGESTRATIONMASSAGE.setText("user registered successfully!");
                RIGESTRATIONMASSAGE.setTextFill(Color.web("#1828d7", 0.8));
                stmt.executeUpdate(insert);
                if (CHECK.isSelected()) {
                    stmt.executeUpdate(test2);
                }
                else
                {
                    stmt.executeUpdate(test3);
                }
                con.commit();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }





    public void cancel(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("addingEmployeeTable.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
    }

    public void closex(MouseEvent mouseEvent) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }
}
