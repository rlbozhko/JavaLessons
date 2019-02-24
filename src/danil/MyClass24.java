package danil;

public class MyClass24 {
    public static void main(String[] args) {
        calcFunc();
    }

    public static void calcFunc(){
        int[] array = new int[100];
        int i = 1;
        int j = 0;
        while (array[99] == 0){

            if(((i % 10) != 4 && (i % 10) != 9) && ((i / 10) != 4 && (i / 10) != 9) && ((i / 10 % 10 != 4 ) && (i / 10 % 10) != 9)){
                array[j] = i;
                j++;
            }
            i++;
        }
        for (i = 0; i < array.length; i++){
            System.out.println(array[i]+" n " + i);
        }
    }
}
