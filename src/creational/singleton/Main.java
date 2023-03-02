package creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.getDescription();

        System.out.println(singleton.getClass());

    }
}
