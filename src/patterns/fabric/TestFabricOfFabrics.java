package patterns.fabric;

interface CarThingProduct {
    void printModel();
}

interface CreatorFF {
    AbstractCreator getCreator(String creator);
}

interface AbstractCreator {
    CarThingProduct getCarThingProduct(String name);
}

public class TestFabricOfFabrics {
    public static void main(String[] args) {
        CommonCreator commonCreator = new CommonCreator();

        AbstractCreator wheelCreator = commonCreator.getCreator("Wheel");

        AbstractCreator doorCreator = commonCreator.getCreator("Door");

        CarThingProduct rosava = wheelCreator.getCarThingProduct("Rosava");

        rosava.printModel();

        CarThingProduct oldDoor = doorCreator.getCarThingProduct("Old");

        oldDoor.printModel();
    }
}

class CommonCreator implements CreatorFF {
    @Override
    public AbstractCreator getCreator(String creator) {
        switch (creator) {
            case "Wheel":
                return new WheelCreator();
            case "Door":
                return new DoorCreator();
            default:
                return null;
        }
    }
}

class WheelCreator implements AbstractCreator {
    @Override
    public CarThingProduct getCarThingProduct(String name) {
        switch (name) {
            case "Rosava":
                return new Rosava();

            case "GoodYear":
                return new GoodYear();
            default:
                return null;
        }
    }
}

class DoorCreator implements AbstractCreator {
    @Override
    public CarThingProduct getCarThingProduct(String name) {
        switch (name) {
            case "Old":
                return new OldDoorStyle();

            case "New":
                return new NewDoorStyle();
            default:
                return null;
        }
    }
}

class Rosava implements CarThingProduct {
    @Override
    public void printModel() {
        System.out.println("Rosava");
    }
}

class GoodYear implements CarThingProduct {
    @Override
    public void printModel() {
        System.out.println("GoodYear");
    }
}

class OldDoorStyle implements CarThingProduct {
    @Override
    public void printModel() {
        System.out.println("Old style door");
    }
}

class NewDoorStyle implements CarThingProduct {
    @Override
    public void printModel() {
        System.out.println("New style door");
    }
}

