package homeworkTwo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HomeWorkTwoMetod {

    public static void main(String[] args) {
        System.out.println("\n5.uzdevums");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        System.out.println("\n6.uzdevums");
        printBusinessCardTwo("Pēteris",  "Krauklis", "+371 258693", 2001);
        printBusinessCardTwo("Zane",  "Pūpola", "+371 44455566",  1900);

        System.out.println("\n7.uzdevums");
        System.out.println(calculateSumma(5, 3));

        System.out.println("\n8.uzdevums");
        System.out.println(averageDouble(5, 3,8));

    }
    static void printBusinessCard(){

            String vards = "Alise";
            String uzvards = "Lapiņa";
            String telefonaNumurs = "+371 12345678";
            int dzimsanasGads = 1999;

            System.out.println("\nVizītkarte");
            System.out.println("###########");
            System.out.println("Vārds: " + vards);
            System.out.println("Uzvārds: " + uzvards);
            System.out.println("Telefona numurs: " + telefonaNumurs);
            System.out.println("Dzimšanas gads: " + dzimsanasGads);
            System.out.println("###########");
        }
    static void printBusinessCardTwo (String vards, String uzvards, String telefonaNumurs, int dzimsanasGads){

        System.out.println("\nVizītkarte");
        System.out.println("###########");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numurs: " + telefonaNumurs);
        System.out.println("Dzimšanas gads: " + dzimsanasGads);
        System.out.println("###########");

    }

    static int calculateSumma (int a, int b){
        return a+b;
    }

    static double averageDouble (double a, double b, double c) {return (a+b+c)/3; }



}
