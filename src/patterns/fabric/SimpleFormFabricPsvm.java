package patterns.fabric;

interface SomeCar {
    String getModel();
}

interface CarCreator {
    SomeCar getCar(String model);
}

public class SimpleFormFabricPsvm {
    public static void main(String[] args) {
        CarCreator carCreator = new CarFabric();

        SomeCar bmw = carCreator.getCar("BMW");
        SomeCar mercedes = carCreator.getCar("Mercedes");

        System.out.println(bmw.getModel());
        System.out.println(mercedes.getModel());
    }
}

class CarFabric implements CarCreator {
    @Override
    public SomeCar getCar(String model) {
        switch (model) {
            case "BMW":
                return new Bmw("x5");
            case "Mercedes":
                return new Mercedes("vito");
            default:
                return null;

        }
    }
}

class Bmw implements SomeCar {
    private String model;

    public Bmw(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}

class Mercedes implements SomeCar {
    private String model;

    public Mercedes(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}

