package danil;

import java.util.Scanner;

public class MyClass21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        calcFunc(length, height, width);

    }

    public static void calcFunc(double length, double height, double width){
        int countl = 0;
        int counth = 0;
        int countw = 0;
        int result = 0;
        double l = 10;
        double h = 4;
        double w = 2.5;

        if(width > 0 && height > 0 && length > 0 && length <= l && height <= h && width <= w) {
        countl = (int)(l / length);
        counth = (int)(h / height);
        countw = (int)(w / width);
        }

        result = counth * countl * countw;
        System.out.println(result);
    }
}
