/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class CoustomerController implements Initializable {

    public ImageView CLOSE;
    public ImageView goright;
    public ImageView goleft;
    public BorderPane mainPane;
    int count =6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
     private void homec(java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("coustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }  
 @FXML
     private void orderc(java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("order.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

     @FXML
     private void love(java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("love.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    } 
      @FXML
     private void rate(java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("rating.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
    public void love(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("love.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void rate(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("rating.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show(); }



    public void orderc(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("order.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void homec(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("coustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("dd.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void exhibits(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("ExhibtsCoustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }

    public void GOLEFT(MouseEvent mouseEvent) {
        count--;
        if(count==4 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide4");
            mainPane.setCenter(view);

        }
        if(count==3 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide3");
            mainPane.setCenter(view);

        }
        if(count==2 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide2");
            mainPane.setCenter(view);

        }
        if(count==1 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide1");
            mainPane.setCenter(view);

        }
        if(count==5 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide5");
            mainPane.setCenter(view);

        }

        if(count==6 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide6");
            mainPane.setCenter(view);

        }
        if(count==7 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide7");
            mainPane.setCenter(view);

        }
        if(count==8 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide8");
            mainPane.setCenter(view);

        }
        if(count==9 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide9");
            mainPane.setCenter(view);

        }
        if (count==0)
        {
            count=5;
        }
        if(count==10)
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide10");
            mainPane.setCenter(view);

        }
    }

    public void GORIGHT(MouseEvent mouseEvent) {
        if(count==4 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide4");
            mainPane.setCenter(view);

        }
        if(count==3 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide3");
            mainPane.setCenter(view);

        }
        if(count==2 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide2");
            mainPane.setCenter(view);

        }
        if(count==1 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide1");
            mainPane.setCenter(view);

        }
        if (count==10)
        {
            count=5;
        }
        if(count==5 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide5");
            mainPane.setCenter(view);

        }
        count++;
        if(count==6 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide6");
            mainPane.setCenter(view);

        }
        if(count==7 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide7");
            mainPane.setCenter(view);

        }
        if(count==8 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide8");
            mainPane.setCenter(view);

        }
        if(count==9 )
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide9");
            mainPane.setCenter(view);

        }
        if(count==10)
        {
            homeEmptest object = new homeEmptest();
            Pane view = object.getPage8("slide10");
            mainPane.setCenter(view);

        }
    }
}
