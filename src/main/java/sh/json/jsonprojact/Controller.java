package sh.json.jsonprojact;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button myButton;

    @FXML
    private void handleButtonClick() {
        System.out.println("Knappen klickades!");
    }
}
