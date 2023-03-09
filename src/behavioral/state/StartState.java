package behavioral.state;

public class StartState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("Player is in start state...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
