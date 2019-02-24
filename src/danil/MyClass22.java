package danil;

import java.util.Scanner;

public class MyClass22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Первый парень");
        int z = sc.nextInt();
        System.out.println("Второй парень");
       int x = sc.nextInt();
        System.out.println("Третий парень");
       int c = sc.nextInt();
       calcfunc(z,x,c);

    }
    public static void calcfunc(int z, int x, int c){
        if(z > x && z > c){
            System.out.println("Больше всех 1 парень");
            System.out.println("На " + (z - x) + " года - 1 парень старше 2 парня");
            System.out.println("На " + (z - c) + " года - 1 парень старше 3 парня");
        }else if(x > z && x > c){
            System.out.println("Больше всех 2 парень");
            System.out.println("На " + (x - z) + " года - 2 парень старше 1 парня");
            System.out.println("На " + (x - c) + " года - 2 парень старше 3 парня");
        }else if(c > x && c > z){
            System.out.println("Больше всех 3 парень");
            System.out.println("На " + (c - z) + " года - 3 парень старше 2 парня");
            System.out.println("На " + (c - x) + " года - 3 парень старше 1 парня");
        }else if(z == x && z > c){
            System.out.println("На " + (z - c) + " года - (1 парень и 2 парень) старше 3 парня");
        }else if(z == c && z > x){
            System.out.println("На " + (z - x) + " года - (1 парень и  3) старше 2 парня");
        }else if(c == x && x > z){
            System.out.println("На " + (x - z) + " года - (2 парень и  3) старше 1 парня");
        }else if(z == x && z == c){
            System.out.println("У всех парнях од. возраст!");
        }else {
            System.out.println("404");
        }
    }
}
