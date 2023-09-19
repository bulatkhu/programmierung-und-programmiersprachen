import java.util.AbstractList;

public class Aktienkurs {
    private AbstractList<Tageskurs> tageskurs;

    public Aktienkurs(AbstractList<Tageskurs> tageskurs) {
        this.tageskurs = tageskurs;
    }

    public String toString(){
        String text = "";
        for (Tageskurs tageskurs1: tageskurs){
            text += tageskurs1.toString();
        }
        return text;
    }
}
