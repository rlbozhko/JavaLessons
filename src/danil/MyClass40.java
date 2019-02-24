package danil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass40 {
    public static void main(String[] args) {
        String[] inputArr = {"baa", "aaa", "aba", "abaa", "a"};

        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {
            int count = 0;

            String stringA = inputArr[i];

            for (int z = 0; z < inputArr.length; z++) {
                if (compareWithoutOrder(stringA, inputArr[z])) {
                    count++;
                }
            }
            if (count == 1) {
                arrayList.add(stringA);
            }
        }

        System.out.println(arrayList);
    }

    public static boolean compareWithoutOrder(String stringA, String stringB) {

        if (stringA.length() != stringB.length()) {
            return false;
        }

        char[] chars = stringA.toCharArray();
        char[] secondChars = stringB.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(secondChars);
        for (int x = 0; x < chars.length; x++) {
            if (chars[x] != secondChars[x]) {
                return false;
            }
        }

        return true;
    }
}

