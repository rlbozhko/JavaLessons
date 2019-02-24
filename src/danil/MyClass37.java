package danil;

public class MyClass37 {
    public static void main(String[] args) {
        char[] zeta = new char[103];
        int specFor;
        for(int i = 0; i < zeta.length; i++){
            specFor = (int) (Math.random() * 4);
            if (specFor == 0){
                zeta[i] = 'М';
            }else if (specFor == 1){
                zeta[i] = 'Ж';
            }else if (specFor == 2){
                zeta[i] = 'О';
            }else if (specFor == 3){
                zeta[i] = 'В';
            }
        }

        int[] z = new int[4];

        for(int i = 0; i < zeta.length; i++){
            if(zeta[i] == 'М'){
                z[0]++;
            }else if(zeta[i] == 'Ж'){
                z[1]++;
            }else if(zeta[i] == 'О'){
                z[2]++;
            }else if(zeta[i] == 'В'){
                z[3]++;
            }
        }

        System.out.println();

        if(z[0] > z[1] && z[0] > z[2] && z[0] > z[3]){
            System.out.println("М - больше всех");
        } else if (z[1] > z[0] && z[1] > z[2] && z[1] > z[3]) {
            System.out.println("Ж - больше всех");
        }else if(z[2] > z[0] && z[2] > z[1] && z[2] > z[3]){
            System.out.println("О - больше всех");
        }else if (z[3] > z[0] && z[3] > z[1] && z[3] > z[2]){
            System.out.println("В - больше всех");
        }else if(z[0] == z[1] && z[0] > z[2] && z[0] > z[3]){
            System.out.println("М и Ж од. количество и больше О и В!");
        }else if(z[0] == z[2] && z[0] > z[1] && z[0] > z[3]){
            System.out.println("М и О од. количество и больше Ж и В!");
        }else if(z[0] == z[3] && z[0] > z[2] && z[0] > z[1]){
            System.out.println("М и В од. количество и больше Ж и О!");
        }else if(z[1] == z[2] && z[1] > z[0] && z[1] > z[3]){
            System.out.println("Ж и О од. количество и больше М и В!");
        }else if(z[1] == z[3] && z[1] > z[0] && z[1] > z[2]){
            System.out.println("Ж и В од. количество и больше М и О!");
        }else if(z[2] == z[3] && z[2] > z[0] && z[2] > z[1]){
            System.out.println("О и В од. количество и больше М и Ж!");
        }else if(z[0] == z[1] && z[0] == z[2] && z[0] > z[3]){
            System.out.println("М и Ж и О од. количество и больше В!");
        }else if(z[1] == z[2] && z[1] == z[3] && z[1] > z[0]){
            System.out.println("Ж и О и В од. количество и больше М!");
        }else if(z[0] == z[2] && z[0] == z[3] && z[0] > z[1]){
            System.out.println("М и О и В од. количество и больше Ж!");
        }else if(z[0] == z[1] && z[0] == z[3] && z[0] > z[2]){
            System.out.println("М и Ж и В од. количество и больше Ж!");
        }else {
            System.out.println("Что-то пошло не так!");
        }
        System.out.println();
        System.out.println(z[0] + " - М");
        System.out.println(z[1] + " - Ж");
        System.out.println(z[2] + " - О");
        System.out.println(z[3] + " - В");
    }
}
