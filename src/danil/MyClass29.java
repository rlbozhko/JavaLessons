package danil;

public class MyClass29 {
    public static void main(String[] args) {
        int[] arrMy = new int[10];
        for(int i = 0; i < arrMy.length; i++){
            arrMy[i] = (int) ((Math.random() * 15) + 1);
        }
        calcFunc(arrMy);
    }
    public static void calcFunc(int[] parametr){
        int mainPoints = 0;
        int reservePoints = 0;
        for(int i = 0; i < parametr.length; i++){
            if((i % 2) == 0){
                mainPoints += parametr[i];
            }else {
                reservePoints += parametr[i];
            }
        }
        if (mainPoints > reservePoints){
            System.out.println("Основные игроки набрали на " + (mainPoints - reservePoints) + " очков больше");
        }else if (mainPoints < reservePoints){
            System.out.println("Запасные игроки набрали на " + (reservePoints - mainPoints) + " очков больше");
        }else if (mainPoints == reservePoints){
            System.out.println("Основные игроки и запасные игроки набрали од. количество очков" + mainPoints);
        }else {
            System.out.println("404");
        }
    }
}
