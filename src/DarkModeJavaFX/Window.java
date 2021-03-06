package DarkModeJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** the window of the GUI*/
public class Window extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Dark Mode JavaFX");
        // load the fxml
        Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }

    public static void launchWindow(String[] args){
        launch(args);
    }

}
