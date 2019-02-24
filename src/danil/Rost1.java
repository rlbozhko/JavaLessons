package danil;

import java.util.ArrayList;
import java.util.List;

public class Rost1 {
/*Дана последовательность целых чисел. Необходимо найти ее самую длинную строго возрастающую подпоследовательность.
Например дано {10, 2, 3, 5, 6, 9, 2, 3, 4, 5, 7, 9, 11};. Ответ будет {2,3,5} */

    public static void delAnagramFunc(int[] inputArray) {
        List<Integer> output = new ArrayList<>();
        List<Integer> tmpArr = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            tmpArr.add(inputArray[i]);
            if ((i != inputArray.length - 1) && (inputArray[i] < inputArray[i + 1])) {
            } else {
                if (tmpArr.size() > output.size()) {
                    output.clear();
                    output.addAll(tmpArr);
                }
                tmpArr.clear();
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 2, 3, 5, 6, 9, 2, 3, 4, 5, 7, 9, 11};
        delAnagramFunc(inputArray);
    }
}