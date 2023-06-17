package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import oracle.jdbc.driver.OracleDriver;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class addsalonController  {
    public TextField WOODTYPET;
    public TextField FABRICTYPET;
    public TextField FURNITURECOLORT;
    public TextField TABLESIZET;
    public TextField CARBITCOLORT;
    public TextField PRICET;
    public TextField NUMOFSEATST;
    public TextField ACCESSORIZINGT;
    public TextField CURTAINST;
    public Label RIGESTRATIONMASSAGE;
    int flag =0;

    public void ADDTEST(ActionEvent actionEvent) throws SQLException {

        if(WOODTYPET.getText().isEmpty()||FABRICTYPET.getText().isEmpty()||FURNITURECOLORT.getText().isEmpty()||TABLESIZET.getText().isEmpty()||
                CARBITCOLORT.getText().isEmpty()
                ||NUMOFSEATST.getText().isEmpty() || ACCESSORIZINGT.getText().isEmpty()|| PRICET.getText().isEmpty()|| CURTAINST.getText().isEmpty() )
        {
            RIGESTRATIONMASSAGE.setText("you must fill all the entrance data!");//#371ce4
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c9260d", 0.8));
        }
        else
        {
            salonmethod();
        }
    }

    private void salonmethod() throws SQLException {
        String woodtype=WOODTYPET.getText();
        String fabrictypetText=FABRICTYPET.getText();
        String furniturecolortText=FURNITURECOLORT.getText();
        String tablesizetText=TABLESIZET.getText();
        String carbitcolortText=CARBITCOLORT.getText();
        String pricetText1=PRICET.getText();
        String numofseatstText=NUMOFSEATST.getText();
        String accessoringtText=ACCESSORIZINGT.getText();
        String curtainstText=CURTAINST.getText();
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();


        String insert= " insert into salon (woodtype,fabrictype,furniturecolor,numofseats,tablesize,carbitcolor,numofaccessorizing,curtainscolor,price) values ('"
                +woodtype+"','"+ fabrictypetText+"','"+furniturecolortText+"','"+numofseatstText+ "','"+tablesizetText+"','"+carbitcolortText+"','"+accessoringtText+"','"+curtainstText +"','"+pricetText1+"')";
        try {


            RIGESTRATIONMASSAGE.setText("the data added successfully to the salon table!");

            RIGESTRATIONMASSAGE.setTextFill(Color.web("#371ce4", 0.8));
            stmt.executeUpdate(insert);
            con.commit();
            con.close();
            SalonController e = new SalonController();
            e.HBOX1.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


}
