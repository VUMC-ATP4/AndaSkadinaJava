package homeworkThree;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkThree {

    public static void main(String[] args) {
        //Uzrakstīt JAVA programmu, kas uzģenerē random skaitli no 0-50.
        //Likt lietotājam minēt šo skaitli ievadot savu variantu
        // kamēr skaitlis netiks uzminēts vai netiks sasniegtas 10 minējumu reizes.
        //Ja lietotāja skaitlis nav pareizs, izvadīt informāciju vai ievadītais skaitlis bija zemāks vai augstāks par uzģenerēto skaitli.
        //Ja lietotājs atmin skaitli, izvadīt uz ekrāna, ka cilvēks atminēja skaitli, izvadīt pašu skaitli un minējumu skaitu.
        //Ja skaitlis netiek uzminēts 10 reizēs, izvadīt uz ekrāna, ka lietotājs ir zaudējis.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(50);
        int a;
        int count = 0;
        do {
            System.out.println("Ievadi skaitli no 0 līdz 50: ");
            a = scanner.nextInt();
            count++;
            //System.out.println("Pareizais skaitlis: " + x);
            System.out.println("Tavs skaitlis: " + a);
            if (a == x) {
                System.out.println("Lieliski! Esi uzminējis! " + "Pareizas skaitlis ir: " + a + ". Tavu minējumu skaits: " + count);

            }else if (a < x) {
                System.out.println("Tavs skaitlis ir par mazu! ");

            }else if (a > x){
                System.out.println("Tavs skaitlis ir par lielu! ");
            }

           // System.out.println("Tavu mēģinājumu skaits: " + count);

        } while (a != x && count <= 10);
        if (a != x){
            System.out.println("Ups! Nevarēji uzminēt 10 reizēs, līdz ar to esi zaudējis:(");
        }




    }
}
