package übung4;

public class Person implements Printable<Person> {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int compareTo(Person compareable) {
        return Integer.compare(this.id, compareable.getId());
    }

    @Override
    public String print() {
        return String.valueOf(this.id);
    }
}
