package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import oracle.jdbc.driver.OracleDriver;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class addentranceController {
    public TextField DOORTYPET;
    public TextField WIDTHT;
    public TextField MIRRORT;
    public TextField CARBITCOLORT;
    public TextField PRICET;
    public TextField HIGHTT;
    public TextField FRAMEST;
    public TextField CHANDILIERT;
    public Label RIGESTRATIONMASSAGE;
    PreparedStatement pst = null;
    public void ADDTEST(ActionEvent actionEvent) throws Exception {
        if(DOORTYPET.getText().isEmpty()||MIRRORT.getText().isEmpty()||CARBITCOLORT.getText().isEmpty()||HIGHTT.getText().isEmpty()|| WIDTHT.getText().isEmpty()||FRAMEST.getText().isEmpty() || CHANDILIERT.getText().isEmpty() )
        {
            RIGESTRATIONMASSAGE.setText("you must fill all the entrance data!");//#371ce4
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c9260d", 0.8));
        }
        else
        {
            entrancemethod();
        }
    }
    public void entrancemethod() throws Exception {
        String doortype=DOORTYPET.getText();
        String mirror=MIRRORT.getText();
        String hight=HIGHTT.getText();
        String width=WIDTHT.getText();
        String carbit=CARBITCOLORT.getText();
        String frames=FRAMEST.getText();
        String chanilier=CHANDILIERT.getText();
        //RIGESTRATIONMASSAGE.setText(doortype);
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();
        String insert= " insert into entrance(doortype,mirrorshape,carbetcolor,hight,width,numfranes,chandeliersize) values ('"+doortype+"','"+
                mirror+"','"+carbit+"','"+hight+ "','"+width+"','"+frames+"','"+chanilier +"')";
        try {


                // java.beans.Statement stmt = (Statement) con.createStatement();
                RIGESTRATIONMASSAGE.setText("the data added successfully to the entrance table!");
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#371ce4", 0.8));
               // CONFIRMPASSWORD.setTextFill(Color.web("#2939ca", 0.8));
                stmt.executeUpdate(insert);
                //stmt.executeUpdate(test2);
                con.commit();
                con.close();

            //RIGESTRATIONMASSAGE.setText("your exhibits added successfully!");
           // RIGESTRATIONMASSAGE.setTextFill(Color.web("#2939ca", 0.8));

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }


}

