package danil;

import java.util.Scanner;

public class MyClass38 {
    static final private int FIVE = 5;
    private final static int MINUSFOURTY = 40;

    public static void main(String[] args) {
        String shifr[] = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+"};

        Scanner sc = new Scanner(System.in);
        String takeAnAnswer = sc.nextLine();
        // "123 a" -> {"1" , "2" , "3",null,"a"}
        String[] input = takeAnAnswer.split("");
        String[] result = new String[input.length];


        for (int i = 0; i < input.length; i++) {
            for (int x = 0; x < shifr.length; x++) {
                if (input[i].equals(shifr[x])) {
                    if (x < MINUSFOURTY) {
                        result[i] = shifr[FIVE + x];
                    } else {
                        result[i] = shifr[x - MINUSFOURTY];
                    }

                }
            }
        }

        for (int u = 0; u < result.length; u++) {
            if (result[u] != null) {
                System.out.print(result[u]);
            } else {
                System.out.println(" ");
            }

        }

    }
}