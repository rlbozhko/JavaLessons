package inheritance.test;

import inheritance.Human;

public class Person implements Human {
    private String name;
    static int x = 5;

    public Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void getNumberOfCars() {
        System.out.println(5);
    }

    public void method1() {
        System.out.println(5);
    }


    public void method2() {
        System.out.println(5);
    }


    public void method4() {
        System.out.println(5);
    }

    public void method3() {
        System.out.println(5);
    }

    public static void main(String[] args) {
        Person person = new Person("");
        x = 6;
        String name = person.name;
    }
}




