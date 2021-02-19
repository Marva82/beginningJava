package com.example.javapractice;

public class MyClass {

    public static void main(String[] args) {
       int change = getMilk(2, 40);
       System.out.println("The amount of change is: $" + change);
    }

//    public static void getMilk() {
//        System.out.println("Open Door");
//        System.out.println("Walk to store");
//        System.out.println("Get milk");
//        System.out.println("Return Home");
//    }

        public static int getMilk(int cartonNum, int startAmount) {

        int pricePaid = cartonNum * 2;

        System.out.println("Open Door");
        System.out.println("Walk to store");
        System.out.println("Get milk " + cartonNum + " cartons please");
        System.out.println("Cost $" + pricePaid + " for " + cartonNum + " cartons of milk");
        System.out.println("Return Home");
        System.out.println();

        return startAmount - pricePaid;
    }
}
