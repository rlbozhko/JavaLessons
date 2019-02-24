package danil;

import java.util.Scanner;


public class MyClass34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calcFunc(sc.nextLine());
    }

    public static void calcFunc(String parametr) {
        int[] sd = new int[parametr.length()];

        for (int i = 0; i < parametr.length(); i++) {
            sd[i] = parametr.charAt(i);
        }

        for (int i = 0; i < parametr.length() - 1; i++) {
            if ((sd[i] <= sd[i + 1])) {
                System.out.println("Это не строго возр. последовательность чисел!");
                return;
            }
        }
        System.out.println("Это строго возр. последовательнось чисел!");
    }
}