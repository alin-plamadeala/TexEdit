package UI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileModel {

    private Path file;

    private String extension;

    private List<String> content;

    public FileModel( Path file) {
        this.file = file;
        this.extension = file.getFileName().toString().substring(file.getFileName().toString().lastIndexOf("."));
        this.content = loadContent(file);
    }

    public Path getFile() {
        return file;
    }

    public void setFile( Path file ) {
        this.file = file;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension( String extension ) {
        this.extension = extension;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent( List<String> content ) {
        this.content = content;
    }

    private List<String> loadContent( Path file) {
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }
}
