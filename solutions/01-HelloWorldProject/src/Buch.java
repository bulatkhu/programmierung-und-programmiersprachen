public class Buch extends Artikel {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getBeschreibung() {
        return "Buch: " + getTitel() + " written by " + getAutor();
    }
}
