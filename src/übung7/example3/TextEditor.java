package übung7.example3;

public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void aendereText(String text) {
        this.text = text;
        System.out.println(text);
    }
}
