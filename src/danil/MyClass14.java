package danil;

import java.util.Scanner;

public class MyClass14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String specString = sc.nextLine();
        System.out.println("Result - " + calculator(specString));

    }

    public static int calculator(String parametr) {
        int func = 0;
        final int specInt = Integer.parseInt(parametr);


            for (int i = 0, f = 1; i < parametr.length(); i++, f *= 10) {
                func += (specInt / f % 10);
            }

        return func;
    }
}
