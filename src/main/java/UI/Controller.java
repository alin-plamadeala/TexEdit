package UI;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.StyledTextArea;

import java.io.File;
import java.util.Iterator;

public class Controller {
    @FXML
    private CodeArea codeArea;

    @FXML
    private void onTest() {
        System.out.println(codeArea.getText());
    }

    @FXML
    private void load() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("./"));
        File file = fileChooser.showOpenDialog(null);

        FileModel fileModel = new FileModel(file.toPath());

        Iterator<String> i = fileModel.getContent().iterator();
        while (i.hasNext()){
            String line = i.next();
            codeArea.appendText(line+"\n");
        }


    }
}
