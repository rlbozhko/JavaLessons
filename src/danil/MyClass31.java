package danil;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass31 {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        for (int i = 0; i < lottery.size(); i++) {

            System.out.print("Ракета " + lottery.get(i));
            System.out.println("   Запуск - " + (i + 1));
        }
    }
}
