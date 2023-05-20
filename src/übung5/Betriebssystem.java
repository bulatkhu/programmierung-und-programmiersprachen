package übung5;

public class Betriebssystem {
    private final Strategie strategie;

    public Betriebssystem(Strategie strategie) {
        this.strategie = strategie;
    }

    public String toString(){
        return strategie.getOS();
    }
}
