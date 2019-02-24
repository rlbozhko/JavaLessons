package danil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class TestClass40 {
    public static void main(String[] args) {
        String[] inputArr = {"baa", "aaa", "aba", "abaa", "a"};
//        String[] inputArrCopy = System.arraycopy();


        Set<String> set = new HashSet<>();

        for (int i = 0; i < inputArr.length; i++) {
            char[] chars = inputArr[i].toCharArray();

            Arrays.sort(chars);

            inputArr[i] = new String(chars);

            set.add(inputArr[i]);
        }

//        System.out.println(Arrays.toString(inputArr));
        System.out.println(set);
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
