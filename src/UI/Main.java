package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main extends Application {

    static final String APP_TITLE = "Text Editor";


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));

        TextArea textArea = (TextArea) root.lookup("#areaText");
        String data = new String(Files.readAllBytes(Paths.get("D:\\code\\java\\TexEdit\\src\\UI\\Controller.java")));
        textArea.setText(data);
        textArea.positionCaret(data.length());

        primaryStage.setTitle(APP_TITLE);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
