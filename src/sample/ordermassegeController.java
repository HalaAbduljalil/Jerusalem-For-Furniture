package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ordermassegeController implements Initializable {
    @FXML
    private Button close;
    public Label name;

    public void COLSE(ActionEvent actionEvent) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();

    }




    public void setName(String text) {

       // JOptionPane.showMessageDialog(null,"in setname");
        name.setText(text);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
