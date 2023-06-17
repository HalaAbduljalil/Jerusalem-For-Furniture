/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.hibernate.cfg.Configuration;

import javax.swing.*;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class BedroomController implements Initializable {


    public ImageView CLOSE;
    public ImageView PUTLOVE1;
    public ImageView BUYIT1;
    public ImageView imageview1;
    public ImageView refresh;
    public HBox hbox1;
    public HBox hbox3;
    public ImageView PUTLOVE3;
    public ImageView love3;
    public HBox hboxyy;
    int flagy=0;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void initialize() {
        try {
            String M = "B";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String str = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con =  DriverManager.getConnection(str,"sahar","1928374655");
            Statement stmt = con.createStatement();
            String sql = "select * from bedroom ";
            String images = "select * from imagetable where mynumber='"+M+"'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs2 = stmt.executeQuery(images);
            String roomarea,numofframes,carbitcolor,closetsize,curtainscolor,bedcolor,bedsize, price,image,number ;

            int numoflights ;
            while (rs.next()||rs2.next())
            {
                roomarea=rs.getString("roomarea");
                numofframes=rs.getString("numofframes");
                carbitcolor=rs.getString("carbitcolor");
                closetsize=rs.getString("closetsize");
                curtainscolor=rs.getString("curtainscolor");
                bedcolor=rs.getString("bedcolor");
                bedsize=rs.getString("bedsize");
                price=rs.getString("price");
                numoflights=Integer.parseInt(rs.getString("numoflights"));
                image=rs2.getString("myimage");
                number=rs2.getString("mynumber");
                 FXMLLoader lo = new FXMLLoader(getClass().getResource("cardbedroom.fxml"));
                Parent root=lo.load();
                cardbedoomController s = lo.getController();
                cardbedoomController.getHBOX2().getChildren().add(root);
                s.view(roomarea,numofframes,carbitcolor,closetsize,curtainscolor,bedcolor,bedsize,price,numoflights,image,number);
                s.initialize(number);
            }

            }catch (Exception throwables) {
            throwables.printStackTrace();
            }
        // TODO
    }

    @FXML
    private void exhibits(ActionEvent event) {

    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("EXhibtsCoustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void SEEMORE(MouseEvent mouseEvent) {
    }

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }

    public void PUTLOVE(MouseEvent mouseEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("massagelove.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();
    }

    public void BUYIT(MouseEvent mouseEvent) throws IOException {

        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("ordernow.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
       // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();

    }



    public void putlove1(MouseEvent mouseEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("massagelove.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();

    }

    public void love3(MouseEvent mouseEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("massagelove.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage newWindow = new Stage();
        // newWindow.setTitle("Second Stage");
        newWindow.setScene(custumer_scene);
        newWindow.show();


    }
    public void refresh(MouseEvent mouseEvent) {
        hboxyy.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hboxyy.setVisible(false);
    }
}
