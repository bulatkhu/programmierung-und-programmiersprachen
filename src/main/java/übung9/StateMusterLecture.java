package übung9;

public class StateMusterLecture {

}

interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}

class SoldState implements State {
    public void insertQuarter() {};
    public void ejectQuarter() {};
    public void turnCrank() {};
    public void dispense() {};
}
