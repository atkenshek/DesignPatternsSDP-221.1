package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone = SmartPhoneFactory.getInstance("Samsung", "IPhone 14 Pro Max");
        System.out.println(iPhone);

        SmartPhone samsung = SmartPhoneFactory.getInstance("Samsung", "Samsung S23");
        System.out.println(samsung);

        SmartPhone xiaomi = SmartPhoneFactory.getInstance("Xiaomi", "Note 10");
        System.out.println(xiaomi);

        System.out.println(iPhone.getClass());
    }
}
