package patterns.singleton;

import java.util.Objects;

//Creational pattern
public class Singleton {
    private static int age;
    //  не стоит инициализировать поля напрямую для большей понятности кода
    // и чтобы не разбираться в порядке инициализации полей...
    private static Singleton object = new Singleton(age);
    static {

    }

    private int number;

    private Singleton(int age) {
        this.age = age;
    }

// не получиться вернуть из конструктора ссылку на другой обьект
// public Singleton(int age,int number ) {
//        return new Singleton(3);
//        и так нельзя
//        return object;
//
//    }

    private static class StaticInnerClass {
        public void print() {
            //System.out.println(number); нельзя т.к. из статика не понятно какой
            System.out.println(age);
        }
    }

    private class InnerClass {
        public void print() {
            System.out.println("");
        }
    }



    public static Singleton getInstance(int age) {

        if (Objects.isNull(object)) {
            object = new Singleton(age);
        }

        return object;
    }

    public static Singleton getObject() {
        return object;
    }

    public static void setObject(Singleton object) {
        Singleton.object = object;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Singleton.age = age;
    }
}
