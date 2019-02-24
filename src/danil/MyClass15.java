package danil;

import java.util.Scanner;

public class MyClass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число!");
        calcFunc(sc.nextInt());
    }
    public static void calcFunc(int parametr){
        if((parametr % 2) == 0){
            System.out.println("Число четное!");
        }else {
            System.out.println("Число не четное!");
        }
    }
}
