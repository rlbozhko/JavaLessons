package danil;

import java.util.Scanner;

public class MyClass16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstN = sc.nextDouble();
        double secondN = sc.nextDouble();
        System.out.println("Поезда столкнуться? " + isCrash(firstN, secondN));
    }

    private static boolean isCrash(double v1, double v2) {
        double time1 = 4 / v1;
        double time2 = 6 / v2;

        //  return (time2 == time1 || time2 < time1);
        return ((time2 / time1) > (4 / 6));

    }
}
