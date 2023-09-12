package übung7.CommandStack;

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
