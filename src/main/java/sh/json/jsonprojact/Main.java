package sh.json.jsonprojact;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label infoLabel = new Label("");

        Label timeLabel = new Label();

        Button timeButton = new Button("              ");
        timeButton.setOnAction(event -> {

            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            timeLabel.setText(formattedTime);
        });


        StackPane root = new StackPane();
        root.getChildren().addAll(infoLabel, timeButton, timeLabel);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("JavaFX App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}