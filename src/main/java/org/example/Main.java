package org.example;

public class Main {
    public static void main(String[] args) {

        //Rolling D6
        System.out.println("D6: " + Dice.D6.roll());
        System.out.println("D6: " + Dice.D6.roll());
        System.out.println("D6: " + Dice.D6.roll());
        System.out.println("-------------");

        //Rolling D10
        System.out.println("D10: " + Dice.D10.roll());
        System.out.println("D10: " + Dice.D10.roll());
        System.out.println("D10: " + Dice.D10.roll());
        System.out.println("-------------");

        //Rolling D20
        System.out.println("D20: " + Dice.D20.roll());
        System.out.println("D20: " + Dice.D20.roll());
        System.out.println("D20: " + Dice.D20.roll());
        System.out.println("-------------");

        //Rolling D100
        System.out.println("D100: " + Dice.D100.roll());
        System.out.println("D100: " + Dice.D100.roll());
        System.out.println("D100: " + Dice.D100.roll());
        System.out.println("-------------");
    }
}