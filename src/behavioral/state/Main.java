package behavioral.state;

public class Main {
    public static void main(String[] args) {



        State startState = new StartState();

        StateContext context = new StateContext();
        System.out.println("Initial state: " + context.getState());

        startState.doAction(context);

        System.out.println("Start state: " + context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);

        System.out.println("Stop state: " + context.getState().toString());

    }
}
