package danil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] inputArray = {"baaa", "aba", "baa", "ab", "a"};
        delAnagramFunc(inputArray);
    }

    public static void delAnagramFunc(String[] inputArray) {
        List<String> resultArray = new ArrayList<>();

        for (String s : inputArray) {
            resultArray.add(s);
        }
        char[] currentCharsArray;
        char[] currentCharsArraySecond;

        for (int i = 0; i < inputArray.length; i++) {
            String currentString = inputArray[i];
            currentCharsArray = currentString.toCharArray();
            Arrays.sort(currentCharsArray);

            for (int j = i + 1; j < inputArray.length; j++) {
                String currentStringSecond = inputArray[j];
                currentCharsArraySecond = currentStringSecond.toCharArray();
                Arrays.sort(currentCharsArraySecond);

                if (Arrays.compare(currentCharsArray, currentCharsArraySecond) == 0) {
                    resultArray.remove(j);
                    resultArray.remove(i);
                }
            }
        }

        System.out.println(resultArray);

/*




        for (String currentString : inputArray) {
            // for (int i;i<inputArray.length ;i++){
            // String currentString = inputArray[i];}

            currentCharsArray = currentString.toCharArray();
            Arrays.sort(currentCharsArray);
            toCopy = 0;

            for (String currentStringSecond : inputArray) {
                currentCharsArraySecond = currentStringSecond.toCharArray();
                Arrays.sort(currentCharsArraySecond);
                if (Arrays.compare(currentCharsArray, currentCharsArraySecond) == 0) {
                    toCopy ++;
                }
            }

            if (toCopy == 1) {
                resultArray[i++] = currentString;
            }
        }*/

/*        for (String currentString : resultArray) {
            System.out.println(currentString);
        }*/
            /*
            s += n;}


        char[] arrayWithAnagramChar = s.toCharArray();  //don't understand how, but i converted string array to char array
        for (int i = 0; i < inputArray.length; i++) {
            char[] ElementsToSort = new char[inputArray[i].length()];

            for (int j = 0; j < ElementsToSort.length; j++) {
                ElementsToSort[j] = arrayWithAnagramChar[j + whatElementsArrayWithAnagramCharUsed];
            }
            Arrays.sort(ElementsToSort);
            inputArrayClone[i] = String.valueOf(ElementsToSort);
            whatElementsArrayWithAnagramCharUsed += inputArray[i].length();
        }
        for (int i = 0; i < inputArrayClone.length; i++) {              // I think an error starting from there..
            for (int j = 0; j < inputArrayClone.length; j++) {
                if (inputArrayClone[i] == inputArrayClone[j] && j == i) {
                    inputArrayClone[i] = "ZZZ";
                    arrayWithoutAnagramCount--;
                }
            }
        }
        String[] arrayWithoutAnagramString = new String[arrayWithoutAnagramCount];
        for (int i = 0; i < inputArrayClone.length; i++) {
            if (inputArrayClone[i] != "ZZZ") {
                arrayWithoutAnagramString[z] = inputArrayClone[i];
                z++;
            }
        }
        for (int i = 0; i < arrayWithoutAnagramString.length; i++) {
            System.out.println(arrayWithoutAnagramString[i]);
        }*/

    }


}

class MyString {
    char[] value;

    public static void main(String[] args) {
        String myString = "NewStr";
        char[] myCharArray = {'a', 'b'};
        String myString2 = new String(myCharArray);
        System.out.println(myString2);
    }
}