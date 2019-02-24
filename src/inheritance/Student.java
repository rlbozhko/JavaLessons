package inheritance;


import inheritance.test.Person;

public class Student extends Person {

    public static void main(String[] args) {


        Person person1 = new Person("Вася");
        Student student = new Student("Вася");

        doSmth(person1);
        doSmth(student);

        StudentDelegate studentDelegate = new StudentDelegate("st");
        doSmth(studentDelegate);
    }

    public static void doSmth(Human person){

       person.method3();
    }

    @Override
    public void getNumberOfCars() {
        int year = 1;//getYear();//call the method from super class
       // return new Object();
    }

    public Student(String name) {
        super("");
    }


}


class StudentDelegate implements Human  {
    Person person;



    public void getNumberOfCars() {
        person.getNumberOfCars();
    }

    public void method1() {
        person.method1();
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



    public StudentDelegate(String name) {
        ;
    }



}

