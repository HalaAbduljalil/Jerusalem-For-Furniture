/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class RatingController implements Initializable {

    public ImageView stary2;
    public ImageView starno1;
    public ImageView CLOSE;
    public ImageView stary3;
    public ImageView stary4;
    public ImageView stary1;
    public BorderPane mainPane;
    public Label thank;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        FXMLLoader f = new FXMLLoader();
        //Pane p = f.load(Card.fxml);
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("dd.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }
@FXML
    public void stary1(MouseEvent mouseEvent) {
    File file = new File("filled-star.png");
    Image image = new Image(file.toURI().toString());
    stary1.setImage(image);
    Image image7 = new Image("@star-emoji.png");
    Image image1 = new Image("@filled-star.png");

    // simple displays ImageView the image as is
    stary1 = new ImageView();
    stary2 = new ImageView();
    stary3 = new ImageView();
    stary4 = new ImageView();
    starno1 = new ImageView();

    stary1.setImage(image);
    stary2.setImage(image1);
    stary3.setImage(image1);
    stary4.setImage(image1);
    starno1.setImage(image1);

    }

    public void stary4(MouseEvent mouseEvent) {
        Image image = new Image("@star-emoji.png");
        Image image1 = new Image("@filled-star.png");

        // simple displays ImageView the image as is
        stary1 = new ImageView();
        stary2 = new ImageView();
        stary3 = new ImageView();
        stary4 = new ImageView();
        starno1 = new ImageView();

        stary1.setImage(image);
        stary2.setImage(image);
        stary3.setImage(image);
        stary4.setImage(image);
        starno1.setImage(image1);
    }

    public void stary3(MouseEvent mouseEvent) {
        Image image = new Image("@star-emoji.png");
        Image image1 = new Image("@filled-star.png");

        // simple displays ImageView the image as is
        stary1 = new ImageView();
        stary2 = new ImageView();
        stary3 = new ImageView();
        stary4 = new ImageView();
        starno1 = new ImageView();

        stary1.setImage(image);
        stary2.setImage(image);
        stary3.setImage(image);
        stary4.setImage(image1);
        starno1.setImage(image1);
    }

    public void stary2(MouseEvent mouseEvent) {
        Image image = new Image("@star-emoji.png");
        Image image1 = new Image("@filled-star.png");

        // simple displays ImageView the image as is
        stary1 = new ImageView();
        stary2 = new ImageView();
        stary3 = new ImageView();
        stary4 = new ImageView();
        starno1 = new ImageView();

        stary1.setImage(image);
        stary2.setImage(image);
        stary3.setImage(image1);
        stary4.setImage(image1);
        starno1.setImage(image1);
    }

    public void starno1(MouseEvent mouseEvent) {

    }

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }
@FXML
    public void staryb1(ActionEvent actionEvent) {

    }

    public void rate1(ActionEvent actionEvent) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage15("star1");
        mainPane.setCenter(view);
        thank.setText("-_-");
    }

    public void rate5(ActionEvent actionEvent) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage15("star5");
        mainPane.setCenter(view);
        thank.setText("thank you alot!");
    }

    public void rate4(ActionEvent actionEvent) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage15("star4");
        mainPane.setCenter(view);
        thank.setText("thanks!");
    }

    public void rate3(ActionEvent actionEvent) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage15("star3");
        mainPane.setCenter(view);
        thank.setText("mercy!");
    }

    public void rate2(ActionEvent actionEvent) {
        homeEmptest object = new homeEmptest();
        Pane view = object.getPage15("star2");
        mainPane.setCenter(view);
        thank.setText("not bad !");
    }
}
