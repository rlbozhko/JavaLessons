package danil;


public class MyClass25 {
    public static void main(String[] args) {
        int[] special = new int[12];
        for (int i = 0; i < 12; i++) {
            special[i] = (int) ((Math.random() * 10));
        }

        Long digit = 123456789012l;
        String s = digit.toString();
        char[] charArray = s.toCharArray();

        int[] numbers = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {

            numbers[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }

        System.out.println(calcFunc(numbers));

    }

    public static int calcFunc(int[] parametr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < parametr.length; i++) {
            if (parametr[i] > max) {
                max = parametr[i];
            }
        }

        return max;
    }


}