package danil;

public class MyClass30 {
    public static void main(String[] args) {
        int[] arrMy1 = new int[5];
        int[] arrMy2 = new int[5];
        for (int i = 0; i < arrMy1.length; i++){
            arrMy1[i] = (int) ((Math.random() * 8)+6);
            arrMy2[i] = (int) ((Math.random() * 8)+6);

        }
        calcFunc(arrMy1,arrMy2);
        calcFunc2(arrMy1,arrMy2);

    }
    public static void calcFunc(int[] parametr1, int[] parametr2){
        System.out.println("Первая команда || Вторая команда");
        for(int i = 0; i < parametr1.length; i++){
            if(parametr1[i] >= 10 && i >= 10){
                System.out.println((i+1) + " игроку " + parametr1[i] + "\t  " + (i+1) +  " игроку " + parametr2[i]);
            }else {
                System.out.println((i+1) + " игроку " + parametr1[i] + "\t\t  " + (i+1) +  " игроку " + parametr2[i]);
            }

        }
    }

    public static void calcFunc2(int[] parametr1, int[] parametr2){
        float averageAgeForFirstTeam = 0;
        float averageAgeForSecondTeam = 0;
        for(int i = 0; i < parametr1.length; i++){
            averageAgeForFirstTeam += parametr1[i];
            averageAgeForSecondTeam += parametr2[i];
        }

        averageAgeForFirstTeam = (averageAgeForFirstTeam / parametr1.length);
        averageAgeForSecondTeam = (averageAgeForSecondTeam / parametr2.length);

        if(averageAgeForFirstTeam > averageAgeForSecondTeam){
            System.out.println("Средний возраст 1 команды больше второй на " + (averageAgeForFirstTeam - averageAgeForSecondTeam));
        }else if(averageAgeForFirstTeam < averageAgeForSecondTeam){
            System.out.println("Средний возраст 2 команды больше первой на " + (averageAgeForSecondTeam - averageAgeForFirstTeam));
        }else if(averageAgeForFirstTeam == averageAgeForSecondTeam){
            System.out.println("У обоих команд одинаковых средний возраст!");
        }
    }
}
