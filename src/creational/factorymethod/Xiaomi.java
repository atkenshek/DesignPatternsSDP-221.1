package creational.factorymethod;

public class Xiaomi extends SmartPhone {
    private String modelName;
    public Xiaomi(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
