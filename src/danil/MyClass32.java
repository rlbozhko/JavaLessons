package danil;

import java.util.Scanner;

public class MyClass32 {
    public static void main(String[] args) {
        int[] mass = {0, 5, 6, 0, 9, 0,12,45,0,99};
        Scanner sc = new Scanner(System.in);
        int[] z = calcfunc2(mass);
        //int[] z = calcfunc2(сalcfunc(sc.nextLine()));
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + ",");
        }
    }

    /*    public static int[] сalcfunc(String parametr) {
            int i[] = new int[parametr.length()];
            for (int y = 0; y < parametr.length(); y++){
            i[y] = parametr.charAt(y);

        return i;
        }
    */
    public static int[] calcfunc2(int[] parametr) {
        int count = 0;
        for (int i = 0; i < parametr.length; i++) {
            if (parametr[i] == 0) {
                parametr[i] = parametr[count];
                parametr[count] = 0;
                count++;
            }
        }
        return parametr;
    }
}
