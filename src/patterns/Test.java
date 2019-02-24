package patterns;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int Vasya, Petya, Colya;
        Vasya = getRandomAge();
        Petya = getRandomAge();
        Colya = getRandomAge();
        System.out.println("Vasya is " + Vasya + " years old. \nPetya is " + Petya + " years old. \nColya is " + Colya + " years old. \n" );
        if (Vasya > Petya) {
            System.out.println("Vasya is older than Petya on " + (Vasya - Petya) + " years.");
        } else if (Vasya < Petya) {
            System.out.println("Petya is older than Vasya on " + (Petya - Vasya) + " years.");
        } else if (Vasya == Petya) {
            System.out.println("Vasya as old as Petya.");
        }

        if (Petya > Colya) {
            System.out.println("Petya is older than Colya on " + (Petya - Colya) + " years.");
        } else if (Petya < Colya) {
            System.out.println("Colya is older than Petya on " + (Colya - Petya) + " years.");
        } else if (Petya == Colya) {
            System.out.println("Petya as old as Colya.");
        }

        if (Vasya > Colya) {
            System.out.println("Vasya is older than Colya on " + (Vasya - Colya) + " years.");
        } else if (Vasya < Colya) {
            System.out.println("Colya is older than Vasya on " + (Colya - Vasya) + " years.");
        } else if (Vasya == Colya) {
            System.out.println("Vasya as old as Colya.");
        }
    }

    public static int getRandomAge() {
        Random rnd = new Random();
        int random = rnd.nextInt(20);
        return random;
    }
}


