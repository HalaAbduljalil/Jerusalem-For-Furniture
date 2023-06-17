package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class entrances {
    public ImageView CLOSE;

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent PARENT_HOME_PAGE = FXMLLoader.load(getClass().getResource("EXhibtsCoustomer.fxml"));
        Scene custumer_scene = new Scene(PARENT_HOME_PAGE);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.setScene(custumer_scene);
        s.show();
    }

    public void SEEMORE(MouseEvent mouseEvent) {
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

    public void CLOSE(MouseEvent mouseEvent) {
        Stage stage = (Stage) CLOSE.getScene().getWindow();
        stage.close();
    }

    public void refresh(MouseEvent mouseEvent) {
    }
}
