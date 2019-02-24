package danil;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class MyClass35 {
    public static void main(String[] args) {
        String arr = "{10,2,3,5,2,3,3,5}";
        String[] special = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\\s", "").split(",");
        calcFinal(calcFunc2(calcFunc(special)),calcFunc(special));

    }
    public static int[] calcFunc(String[] parametr){
       int[] special = new int[parametr.length];
        for(int i = 0; i < parametr.length; i++){
            special[i] = parseInt(parametr[i]);
    }
    return special;
    }

    public static int[] calcFunc2(int[] parametr){
        int[] counts = new int[parametr.length];
        Arrays.fill(counts,0);
        int zeta = 0;
        for (int i = 0; i < parametr.length-1; i++){
            if(parametr[i] < parametr[i+1]){
                counts[i+1] = ++zeta;
            }else if(parametr[i] >= parametr[i+1]){
                zeta = 0;
                counts[i+1] = zeta;
            }
        }
        return counts;
    }

    public static void calcFunc3(int[] parametr){
        for (int i = 0; i < parametr.length; i++){
            System.out.println(parametr[i]);
        }
    }
    public static void calcFinal(int[] parametr, int[] parametrCalc1){
        int max = parametr[0];
        int position = 0;
        for(int i =0; i < parametr.length; i++){
            if(max < parametr[i]){
                max = parametr[i];
                position = i;
            }
        }
        for (int i = max; i >= 0; i--){
            System.out.print(parametrCalc1[position-i] + " ");

        }


    }

}
