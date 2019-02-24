package patterns.abstractFabric;

/*
* Порождающий паттерн
* */
public class AbstractFabric {
    public static void main(String[] args) {
        GardenFabric fabric = new RealGarden();
        //RealGarden fabric = new RealGarden();

        Carrots carrots = fabric.createCarrots();

        carrots.growth();


        Melon melon = fabric.createMelon();
        Raspberry raspberry = fabric.createRaspberry();

// absract usage
        GardenFabricAbstr gardenFabricA = new GardenFabricA();
        //GardenFabricA gardenFabricA = new GardenFabricA();
        Raspberry raspberry1 = gardenFabricA.createRaspberry();
        raspberry1.increase();
    }
}

interface Carrots {
    void growth();
}

interface Melon {
    void increase();
}

interface Raspberry {
    void increase();
}

class GardenCarrots implements Carrots {
    @Override
    public void growth() {
        System.out.println("Carrots growth");
    }
}

class GardenMelon implements Melon {
    @Override
    public void increase() {
        System.out.println("Melon increase");
    }
}

class GardenRaspberry implements Raspberry {
    @Override
    public void increase() {
        System.out.println("Raspberry changes color");
    }
}



interface GardenFabric {
    Carrots createCarrots();

    Melon createMelon();

    Raspberry createRaspberry();
}

class RealGarden implements GardenFabric {
    @Override
    public Carrots createCarrots() {
        return new GardenCarrots();
    }

    @Override
    public Melon createMelon() {
        return new GardenMelon();
    }

    @Override
    public Raspberry createRaspberry() {
        return new GardenRaspberry();
    }
}

    abstract class GardenFabricAbstr {
        abstract Carrots createCarrots();

        abstract Melon createMelon();

        abstract Raspberry createRaspberry();

    }

     class GardenFabricA extends GardenFabricAbstr {
         @Override
         public Carrots createCarrots() {
             return new GardenCarrots();
         }

         @Override
         public Melon createMelon() {
             return new GardenMelon();
         }

         @Override
         public Raspberry createRaspberry() {
             return new GardenRaspberry();
         }
    }




