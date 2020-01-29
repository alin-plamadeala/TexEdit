package UI;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea areaText;

    @FXML
    private void onTest() {
        System.out.println(areaText.getText());
    }

}
