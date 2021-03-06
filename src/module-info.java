module javaFXTry1 {

    requires javafx.controls;
    requires javafx.fxml;

    opens DarkModeJavaFX to javafx.fxml;

    exports DarkModeJavaFX to javafx.graphics;
}