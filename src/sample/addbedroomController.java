package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addbedroomController {
    public TextField ROOMAREA;
    public TextField NUMOFFRAMEST;
    public TextField CARBITCOLORT;
    public TextField CLOSETT;
    public TextField BEDSIZET;
    public TextField LIGHTST;
    public TextField BEDCOLORT;
    public TextField CURTAINSCOLORT;
    public TextField PRICET;
    public Label RIGESTRATIONMASSAGE;
    public TextField IDT;

    public void ADDTEST(ActionEvent actionEvent) throws SQLException {
        if(IDT.getText().isEmpty()||ROOMAREA.getText().isEmpty()||NUMOFFRAMEST.getText().isEmpty()||CARBITCOLORT.getText().isEmpty()||CLOSETT.getText().isEmpty()||
                CARBITCOLORT.getText().isEmpty()
                ||BEDSIZET.getText().isEmpty() || LIGHTST.getText().isEmpty()|| BEDCOLORT.getText().isEmpty()|| CURTAINSCOLORT.getText().isEmpty()
                || PRICET.getText().isEmpty())
        {
            RIGESTRATIONMASSAGE.setText("you must fill all the entrance data!");//#371ce4
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c9260d", 0.8));
        }
        else
        {
            bedroommethod();
        }
    }private void bedroommethod()
            throws SQLException {
        String roomareaText=ROOMAREA.getText();
        String numofframestText=NUMOFFRAMEST.getText();
        String carbitcolortText=CARBITCOLORT.getText();
        String closettText=CLOSETT.getText();
        String pricetText=PRICET.getText();
        String bedsizetText=BEDSIZET.getText();
        String lightstText=LIGHTST.getText();
        String bedcolortText=BEDCOLORT.getText();
        String curtainscolortText=CURTAINSCOLORT.getText();
        String ID=IDT.getText();
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();


        String insert= " insert into bedroom (roomarea,numofframes,carbitcolor,closetsize,curtainscolor,bedcolor,numoflights,bedsize,price,id) values ('"
                +roomareaText+"','"+ numofframestText+"','"+carbitcolortText+"','"+closettText+ "','"+curtainscolortText+"','"+bedcolortText+"','"+lightstText+"','"
                +bedsizetText +"','"+pricetText+"','"+ID+"')";
        try {


            RIGESTRATIONMASSAGE.setText("the data added successfully to the salon table!");
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#371ce4", 0.8));
            stmt.executeUpdate(insert);
            con.commit();
            con.close();


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
}
