package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import oracle.jdbc.driver.OracleDriver;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.Initializable;
import org.hibernate.loader.Loader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ordernowcontroller implements Initializable {
    public TextField name;
    public TextField email;
    public TextField ordernumber;
    public TextField address;
    public RadioButton creditcard;
    public RadioButton cash;
    public TextField paymentmethod;
    public ImageView CLOSE;


    public Label RIGESTRATIONMASSAGE;



    @FXML


    public void CLOSE(MouseEvent mouseEvent) {
    }

    public void ORDERBUTTON(ActionEvent actionEvent) throws Exception {
        if(name.getText().isEmpty()||email.getText().isEmpty()||ordernumber.getText().isEmpty()||address.getText().isEmpty()||
                paymentmethod.getText().isEmpty())
        {
            RIGESTRATIONMASSAGE.setText("you must fill all the order data!");
            RIGESTRATIONMASSAGE.setTextFill(Color.web("#c90a0a", 0.8));

        }
        else
        {
            registerUser();
        }
    }
    public void registerUser() throws Exception {
        String nameText=name.getText();
        String emailText=email.getText();
        String ordernumberText=ordernumber.getText();
        String addressText=address.getText();
        String paymentmethodText=paymentmethod.getText();
        DriverManager.registerDriver(new OracleDriver());
        String str = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
        Statement stmt =  con.createStatement();
        String test2= " insert into myorder (myname,address,orderno,email,paymentmethod ) values" +
                " ('"+nameText+"','"+addressText+"','"+ordernumberText+"','"+emailText+"','"+paymentmethodText+"')" ;
        try {
            {
                /*Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("ordermassege.fxml"));
                Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
                Stage newWindow = new Stage();
                // newWindow.setTitle("Second Stage");
                newWindow.setScene(custumer_scene);
                newWindow.show();*/

               // RIGESTRATIONMASSAGE.setText("your order has been successfully added !");
               // RIGESTRATIONMASSAGE.setTextFill(Color.web("#460cf2", 0.8));
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ordermassege.fxml"));
                Parent root  =(Parent) loader.load();
                ordermassegeController X = loader.getController();
                X.setName(name.getText());
                Stage newWindow = new Stage();
                newWindow.setScene(new Scene(root));
                newWindow.show();
                stmt.executeUpdate(test2);
                con.commit();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


    @Override
    public void initialize(Configuration configuration) {

        ToggleGroup group = new ToggleGroup();
        creditcard.setToggleGroup(group);

        if (creditcard.isSelected())
            cash.setSelected(false);
        if (cash.isSelected())
            creditcard.setSelected(false);
        cash.setToggleGroup(group);
        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        root.getChildren().addAll(creditcard,cash);

    }
}
