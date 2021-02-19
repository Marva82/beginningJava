package com.example.datingcalc;
import java.util.Random;

public class loveCalc {
    public static void main(String[] args) {

        System.out.println("Your datability score: " + ifYouHadMyLove("Mr X.", "Miss Y"));

    }

    public static int ifYouHadMyLove(String yourName, String theirName){

        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if (loveScore > 80) {
            System.out.println(yourName + " and " + theirName + " You love each other a lot");
        } else if (loveScore > 40) {
            System.out.println(yourName + " and " + theirName + " Kinda some love there");
        }
        else {
            System.out.println(yourName + " and " + theirName +" No love right now");
        }


        return loveScore;
    }
}