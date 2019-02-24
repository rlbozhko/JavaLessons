package danil;

public class MyClassTest24 {
    public static boolean noContainsFour(int n) {
        int tens = n / 10;
        int first = n % 10;

        return tens != 4 && first != 4;
    }

    public static boolean noContainsNine(int n) {
        int tens = n / 10;
        int first = n % 10;

        return tens != 9 && first != 9;
    }

    public static boolean specialFuncForHundreds(int n){
        int tens = n / 10;
        int restHundreds = tens % 10;
        return restHundreds != 9 && restHundreds != 4;
    }

    public static void main(String[] args) {
        int n = 1;
        int a = 1;
        int max = 100;
        while (a <= max) {
            if (noContainsFour(n) && noContainsNine(n) && specialFuncForHundreds(n)) {
                System.out.println(a + " Shuttle - Number " + n);
                a++;
            }
            n++;
        }
    }
}
