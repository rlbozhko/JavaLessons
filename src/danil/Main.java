package danil;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] firstTeam = new int[25];
        int[] secondTeam = new int[25];
        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = rndAge();
        }
        for (int i = 0; i < secondTeam.length; i++) {
            secondTeam[i] = rndAge();
        }
        startMenu(firstTeam, secondTeam);
        //secondTeam.

    }

    private static int rndAge() {
        Random random = new Random();
        int rndAge = 14 + random.nextInt(41 - 14); //from 14 to 40
        return rndAge;
    }

    private static void startMenu(int[] firstTeam, int[] secondTeam) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which team do you want to continue with?");
        System.out.println("First --> enter 1 \nSecond --> enter 2");
        int choose = sc.nextInt();
        if (choose == 1) {
            continueMenu(firstTeam, 1);
        } else if (choose == 2) {
            continueMenu(secondTeam, 2);
        } else {
            System.out.println("Something got wrong, please try again:");
            startMenu(firstTeam, secondTeam);
        }
    }

    private static void continueMenu(int[] team, int whatTeam) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to know about " + whatTeam + " team?");
        System.out.println("Age of players --> 1 \nAverage age of players --> 2");
        int choose = sc.nextInt();
        if (choose == 1) {
            for (int i = 0; i < team.length; i++) {
                int player = 1;
                player += i;
                System.out.println("Age of " + player + " player is " + team[i]);
            }
        } else if (choose == 2) {
            int ageSum = 0;
            for (int i = 0; i < team.length; i++) {
                ageSum += team[i];
            }
            int averageAge = ageSum / 25;
            System.out.println("Average age of " + whatTeam + " team is " + averageAge);
        } else {
            System.out.println("Something got wrong, please try again.");
        }
    }
}



