package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class addkitchenController {
    public TextField WOODTYPET;
    public TextField WIDTHT;
    public TextField MARBLETYPET;
    public TextField KITCHENCOLORT;
    public TextField SHELVEST;
    public TextField HIGHTT;
    public TextField ELECTICALT;
    public TextField PRICET;
    public Label RIGESTRATIONMASSAGE;

    public void ADDTEST(ActionEvent actionEvent) throws Exception {
        if(WOODTYPET.getText().isEmpty()||WIDTHT.getText().isEmpty()||MARBLETYPET.getText().isEmpty()||KITCHENCOLORT.getText().isEmpty()|| SHELVEST.getText().isEmpty()||HIGHTT.getText().isEmpty() || ELECTICALT.getText().isEmpty()|| PRICET.getText().isEmpty() )
        {
            RIGESTRATIONMASSAGE.setText("you must fill all the entrance data!");//#371ce4
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c9260d", 0.8));
        }
        else
        {
            kitchenmethod();
        }
    }
    public void kitchenmethod() throws Exception {
        String woodtype=WOODTYPET.getText();
        String marble=MARBLETYPET.getText();
        String hight=HIGHTT.getText();
        String width=WIDTHT.getText();
        String kitchencolortText=KITCHENCOLORT.getText();
        String shelvestText=SHELVEST.getText();
        String electicaltText=ELECTICALT.getText();
        String pricetText=PRICET.getText();
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();
        String insert= " insert into kitchen(woodtype,marbletype,kitchencolor,numofshelves,width,hight,electricaltype,price) values ('"+woodtype+"','"+
                marble+"','"+kitchencolortText+"','"+shelvestText+ "','"+width+"','"+hight+"','"+electicaltText +"','"+pricetText+"')";
        try {


            RIGESTRATIONMASSAGE.setText("the data added successfully to the kitchen table!");
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
