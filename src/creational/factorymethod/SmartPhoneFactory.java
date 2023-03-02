package creational.factorymethod;

public class SmartPhoneFactory {
    public static SmartPhone getInstance(String name, String modelName){
        if(name == "IPhone"){
            return new IPhone(modelName);
        } else if (name == "Samsung") {
            return new Samsung(modelName);
        } else if (name == "Xiaomi") {
            return new Xiaomi(modelName);
        }
        return null;
    }
}
