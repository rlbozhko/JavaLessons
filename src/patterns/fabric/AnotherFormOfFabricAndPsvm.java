package patterns.fabric;

//есть две ветки , ветка реализаторов Creator,
// и ветка возвращаемых обьектов Product
// конкретная реализация Creator возвращает инстанс
// соответствующей конкретной реализации Product

interface Product {

}

interface Creator {
    Product createProduct();
}

public class AnotherFormOfFabricAndPsvm {
    public static void main(String[] args) {
        int rnd = 5;

        Creator creator = null ;
        switch (rnd) {
            case 5: creator = new ConcreteCreatorA();
                break;
            case 9: creator = new ConcreteCreatorB();
                break;
        }
        Product product1 = creator.createProduct();

    }
}



class ConcreteProductA implements Product {
}

class ConcreteProductB implements Product {
}

class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}