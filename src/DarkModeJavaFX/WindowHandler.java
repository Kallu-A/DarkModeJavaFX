package DarkModeJavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class WindowHandler implements Initializable {

    @FXML
    protected void handlerDarkMode(ActionEvent e){
        Button button = (Button) e.getSource();
        Scene scene = button.getScene();
        // style for the darkmode
        scene.getRoot().setStyle("-fx-base:black");
    }

    @FXML
    protected void handlerNormalMode(ActionEvent e){
        Button button = (Button) e.getSource();
        Scene scene = button.getScene();
        //style for the normale mode
        scene.getRoot().setStyle("");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
