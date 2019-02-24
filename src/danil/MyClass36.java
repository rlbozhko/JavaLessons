package danil;

import java.util.Scanner;

public class MyClass36 {
    public int weightInGrams = 80436;
    public int weight = weightInGrams/1000;

    public int getWeight() {
        return weight/1000;
    }

    public int getWeightGrams() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calcFunc(sc.nextLine());

    }
    public static void calcFunc(String parametr){
        int z = 0;
        for (int i = 0; i < parametr.length(); i++){
            z+=parametr.charAt(i);
        }
        System.out.println("Ваш номер = " + z);
    }
}
