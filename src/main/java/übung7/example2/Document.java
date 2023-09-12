package übung7.example2;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Document {
    private final File file;

    public Document(String path) {
        file = new File(path);
    }

    public Document(File file) {
        this.file = file;
    }

    public void Open() {
        try {
            var reader = new Scanner(file);
            var content = reader.toString();
            System.out.println("Open document: " + content);
        } catch (FileNotFoundException notFoundException) {
            System.out.println("Can't open file: " + notFoundException.getMessage());
        }
    }

    public void Save() {
        System.out.println("Save document");
    }

    public String getFilePath() {
        return file.getPath();
    }
}
