package danil;

import java.util.Scanner;

public class MyClass26 {
    public static void main(String[] args) {
        boolean isContinue = true;
        int specialInt = (int) ((Math.random() * 10) + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число в диапозоне от 1 до 10");
        int z = 0;
        while (isContinue) {
            z = sc.nextInt();
            if (specialInt == z) {
                System.out.println("===========================================");
                System.out.println("Вы угадали загаданное число которое было " + specialInt);
                System.out.println("===========================================");
                isContinue = false;
            }else if(specialInt < z) {
                System.out.println("===========================================");
                System.out.println("Загаданное число меньше введеного " );
                System.out.println("===========================================");
            }else if(specialInt > z) {
                System.out.println("===========================================");
                System.out.println("Загаданное число больше введеного ");
                System.out.println("===========================================");
            }else {
                System.out.println("===========================================");
                System.out.println("Повторите еще раз!");
                System.out.println("===========================================");
            }

        }
    }

}
