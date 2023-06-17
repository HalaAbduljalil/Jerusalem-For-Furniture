package sample ;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class cardbedoomController implements Initializable {
    public ImageView PUTLOVE2;
    public ImageView SEEMORE2;
    public ImageView BUYIT2;
    public ImageView imageview1;

    public void setHBOX(HBox HBOX) {
        this.HBOX = HBOX;
    }

    public HBox HBOX;
    static HBox HBOX2;

    public static void setHBOX2(HBox HBOX2) {
        cardbedoomController.HBOX2 = HBOX2;
    }

    public static HBox getHBOX2() {
        return HBOX2;
    }

    String M;

    public HBox getHBOX() {
        return HBOX;
    }

    @FXML
    private Label roomareaL;

    @FXML
    private Label numframesL;

    @FXML
    private Label carbitcolorL;

    @FXML
    private Label closetL;

    @FXML
    private Label curtainsL;

    @FXML
    private Label bedcolorL;

    @FXML
    private Label bedsizeL;

    @FXML
    private Label lightsL;

    @FXML
    private Label priceL;
    public void view(String roomarea, String numofframes, String carbitcolor, String closetsize, String curtainscolor, String bedcolor,
                     String bedsize, String price, int numoflights, String image, String imagetype) throws FileNotFoundException {
        roomareaL.setText(roomarea);
        numframesL.setText(numofframes);
        carbitcolorL.setText(carbitcolor);
        closetL.setText(closetsize);
        curtainsL.setText(curtainscolor);
        bedcolorL.setText(bedcolor);
        bedsizeL.setText(bedsize);
        lightsL.setText(String.valueOf(numoflights));
        priceL.setText(price);
        FileInputStream input = new FileInputStream(image);
        Image image1 = new Image(input);
        imageview1.setImage(image1);
    }
    public void initialize(String s)
    {M=s;

    }

    public void SEEMORE(MouseEvent mouseEvent) {
    }

    public void PUTLOVE(MouseEvent mouseEvent) {
    }

    public void BUYIT(MouseEvent mouseEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HBOX2=HBOX;
    }
}
