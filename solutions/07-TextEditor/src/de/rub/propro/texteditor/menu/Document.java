package de.rub.propro.texteditor.menu;

import java.io.File;

public class Document {
    private File file;

    public Document(String filename) {
        this.file = new File(filename);
    }

    public void Open() {
        System.out.println("de.rub.propro.texteditor.menu.Document " + file.getName() + " opened");
    }

    public void Save() {
        System.out.println("de.rub.propro.texteditor.menu.Document " + file.getName() + " saved");
    }

    public String getFilePath() {
        return file.getPath();
    }

}
