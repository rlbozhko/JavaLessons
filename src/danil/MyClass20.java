package danil;

import java.util.Scanner;

public class MyClass20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int length = sc.nextInt();
        int kg = sc.nextInt();
        calcFunc(height, width, length, kg);
    }

    public static void calcFunc(int height, int width, int length, int kg) {
        int countwrong = 0;
        if (height > 0 && width > 0 && length > 0 && kg > 0) {
            if (kg < 1000) {
                if (height > 1) {
                    countwrong++;
                }
                if (width > 1) {
                    countwrong++;
                }
                if (length > 1) {
                    countwrong++;
                }
                if (countwrong > 1) {
                    System.out.println("Нельзя");
                } else {
                    System.out.println("Можно");
                }
            }
        } else {
            System.out.println("Нельзя");
        }
    }
}

