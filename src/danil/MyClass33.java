package danil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyClass33 {
    public static void main(String[] args) {
        Integer[] arr = {9, 4, 1, 2, 4};
        calcFunc(arr);
    }

    public static void calcFunc(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer> (Arrays.asList(arr));
        System.out.println("3 = "+arrayList3);
        for (int i : arr) {
            arrayList2.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (Collections.frequency(arrayList2, arr[i]) == 1) {
                arrayList.add(arr[i]);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void calcFunc2(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList();

        for (int element : arr) {
            int count = 0;
            for (int elementInner : arr) {
                if (element == elementInner) {
                    count++;
                }

            }
            if (count == 1) {
                arrayList.add(element);
            }
        }

/*        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                arrayList.add(arr[i] );
            }
        }*/

        System.out.println(arrayList);

        }

    }
