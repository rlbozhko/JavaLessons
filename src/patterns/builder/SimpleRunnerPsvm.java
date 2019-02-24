package patterns.builder;

import java.util.Objects;
import java.util.Random;

enum Transmission {
    MANUAL, AUTO;
}

/*
 * Creational pattern
 * */
public class SimpleRunnerPsvm {
    public static void main(String[] args) {
        Car bmw = new CarBuilder()
                .buildName("BMW")
                .buildSpeed(200)
                .buildTransmission(Transmission.AUTO)
                .build();

        Car bmwNew = new CarBuilderAssociation()
                .buildName("BMW")
                .buildSpeed(200)
                .buildTransmission(Transmission.AUTO)
                .build();

        Car bmwExtend = new CarBuilderExtend()
                .buildName("BMW")
                .buildSpeed(200)
                .buildTransmission(Transmission.AUTO)
                .build();


        Car car = new Car(Transmission.AUTO, "VAZ", 120);
        car.setName("BMW");
    }
}

class Car {
    protected Transmission transmission;
    protected String name;
    protected int maxSpeed;

    public Car(Transmission transmission, String name, int maxSpeed) {
        //а если логика сетания разная то и это не спасет...
        // Не всегда хорошо когда все в одном месте
        //мой неудачный вариант обойтись без билдера, типа в конструкторе вместо ненужных параметров ставим null
        if (Objects.isNull(transmission)) {
            this.transmission = Transmission.AUTO;
        } else {
            this.transmission = transmission;
        }
        this.name = name;

        //эмуляция долгого создания обьекта
        int f = 0;
        for (long i = 0; i < maxSpeed * Integer.MAX_VALUE; i++) {
            for (long j = 0; j < maxSpeed * Integer.MAX_VALUE; i++) {
                f = new Random().nextInt(20);
            }
        }

        this.maxSpeed = f;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        int f = 0;
        for (long i = 0; i < maxSpeed * Integer.MAX_VALUE; i++) {
            for (long j = 0; j < maxSpeed * Integer.MAX_VALUE; i++) {
                f = new Random().nextInt(20);
            }
        }
        this.maxSpeed = f;
    }

    @Override
    public String toString() {
        return "Car{" +
                "transmission=" + transmission +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class CarBuilder {
    private Transmission transmission;
    private String name;
    private int maxSpeed;

    public CarBuilder() {
        transmission = Transmission.AUTO;
        name = "VAZ";
        maxSpeed = 100;
    }

    // мое творчество избежать паттерна
    public CarBuilder(Transmission transmission, String name, int maxSpeed) {
        if (Objects.isNull(transmission)) {
            transmission = Transmission.AUTO;
        } else {
            this.transmission = transmission;
        }
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    // в отличии от сеттера возвращает this для цепочек
    CarBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    CarBuilder buildSpeed(int speed) {
        this.maxSpeed = speed;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    // ключевой замыкающий - запускающий метод билдера
    Car build() {
        // иниициализируется полями билдера!!!
        return new Car(transmission, name, maxSpeed);
    }
}

// мне не нравится new Car - возможно ресурсоемко...
// но проще реализация
class CarBuilderAssociation {
    private Car car;

    public CarBuilderAssociation() {
        car = new Car(Transmission.AUTO, "VAZ", 120);
    }

    CarBuilderAssociation buildName(String name) {
        car.setName(name);
        return this;
    }

    CarBuilderAssociation buildSpeed(int speed) {

        car.setMaxSpeed(speed);
        return this;
    }

    CarBuilderAssociation buildTransmission(Transmission transmission) {
        car.setTransmission(transmission);
        return this;
    }

    Car build() {
        return car;
    }
}

// bad case , wrong use of inheritance because
// -no logical hierarchy, no need of polymorfism
class CarBuilderExtend extends Car {

    public CarBuilderExtend() {
        super(Transmission.AUTO, "VAZ", 120);
    }

    CarBuilderExtend buildName(String name) {
        this.name = name;
        return this;
    }

    CarBuilderExtend buildSpeed(int speed) {
        this.maxSpeed = speed;
        return this;
    }

    CarBuilderExtend buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    Car build() {
        return this;
    }
}
