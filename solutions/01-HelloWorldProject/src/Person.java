import java.util.Date;

public class Person {
    private int alter;

    private String name;

    public Person(int alter) {
        setAlter(alter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAlter() {
        return alter;
    }

    public void setAlter(int pAlter) {
        if(pAlter < 0)
            alter = 0;
        else
            alter = pAlter;
    }

}
