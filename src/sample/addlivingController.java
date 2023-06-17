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

public class addlivingController {
    public TextField WOODTYPET;
    public TextField WIDTHT;
    public TextField FRAMEST;
    public TextField FURNITURET;
    public TextField SEATST;
    public TextField HIGHTT;
    public TextField ACCESSORINGT;
    public TextField PRICET;
    public Label RIGESTRATIONMASSAGE;

    public void ADDTEST(ActionEvent actionEvent) throws SQLException {
        if(WOODTYPET.getText().isEmpty()||WIDTHT.getText().isEmpty()||FRAMEST.getText().isEmpty()||FURNITURET.getText().isEmpty()|| SEATST.getText().isEmpty()||HIGHTT.getText().isEmpty() || ACCESSORINGT.getText().isEmpty()|| PRICET.getText().isEmpty() )
        {
            RIGESTRATIONMASSAGE.setText("you must fill all the entrance data!");//#371ce4
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c9260d", 0.8));
        }
        else
        {
            livingmethod();
        }
    }

    private void livingmethod() throws SQLException {
        String woodtype=WOODTYPET.getText();
        String framestText=FRAMEST.getText();
        String hight=HIGHTT.getText();
        String width=WIDTHT.getText();
        String furnituretText=FURNITURET.getText();
        String seatstText=SEATST.getText();
        String accessoringtText=ACCESSORINGT.getText();
        String pricetText=PRICET.getText();
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();

        String insert= " insert into livingroom (woodtype,numofframes,furniturecolor,numofseats,width,hight,numofaccessorizing,price) values ('"+woodtype+"','"+
                framestText+"','"+furnituretText+"','"+seatstText+ "','"+width+"','"+hight+"','"+accessoringtText +"','"+pricetText+"')";
        try {


            RIGESTRATIONMASSAGE.setText("the data added successfully to the livingroom table!");
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
