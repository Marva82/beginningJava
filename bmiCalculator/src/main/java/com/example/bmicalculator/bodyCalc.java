package com.example.bmicalculator;
import java.util.Random;

public class bodyCalc {
    public static void main(String[] args) {

        System.out.println("Your BMI score: " + bmiCalc(180,6));

    }

    public static double bmiCalc(double weight, double height) {

        Random randObjmass = new Random();
        Random randObjheight = new Random();

        double randMass = randObjmass.nextInt(400);
        double randHeight = randObjheight.nextInt(8);

        double bmiScore = randMass / Math.pow(randHeight, 2);

        if (height != 0 || weight != 0) {
            if (bmiScore > 10 && bmiScore < 99) {
                System.out.println("Your about average");
                System.out.println("Perfect score: " + (weight / Math.pow(height, 2)));
            } else if (bmiScore > 100) {
                System.out.println("Need to lose a few pounds");
                System.out.println("Perfect score: " + (weight / Math.pow(height, 2)));
            } else {
                System.out.println("Hey skinny");
                System.out.println("Perfect score: " + (weight / Math.pow(height, 2)));
            }
        } else {
            System.out.println("Invalid entry");
        }


        return  bmiScore;
    }
}