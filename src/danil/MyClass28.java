package danil;

public class MyClass28 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        calcFunc(arr);
    }

    public static void calcFunc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
        }

        int max = Integer.MIN_VALUE;
        int[] arrCount = new int[array.length];
        int[] arrInt = new int[array.length];
        int specCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                specCount = 0;
                arrCount[specCount] = i+1;
                arrInt[specCount] = array[i];
            } else if (max == array[i]) {
                specCount++;
                arrCount[specCount] = i+1;
                arrInt[specCount] = array[i];

            }
        }


        for (int i = 0, count = 1; i < array.length; i++, count++) {
            System.out.println("у " + count + " человека такова вероятность " + array[i]);
        }
        for (int i = 0; i <= specCount; i++) {
            System.out.println("Самая большая вероятность у " + arrCount[i] + " = " + arrInt[i]);
        }

    }

}



