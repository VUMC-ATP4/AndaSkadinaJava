package homeworkThree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.uzdevums

        System.out.println("1.uzdevums=================================");

        int skaitlis;
        int summa = 0;

        while  (summa <= 100){

            System.out.println("Ieraksti skaitli");
            skaitlis = scanner.nextInt();
            summa = summa + skaitlis;
        }
        System.out.println("Gatavs!");


//        2. uzdevums

        System.out.println("\n2.uzdevums=================================");
        System.out.println("Ievadi skaitli, kas lielāks par 1");
        int pirmskaitlis = scanner.nextInt();
        scanner.nextLine();
        int dalitajs;

        if (pirmskaitlis == 2) {
            System.out.println("Skaitlis " + pirmskaitlis + " ir pirmskaitlis.");

        }else if (pirmskaitlis <= 1){
            System.out.println("Skaitlis nevar būt mazāks vai vienāds ar 1! Sāc no sākuma!");

            }else{
                    for (dalitajs = 2; dalitajs < pirmskaitlis; dalitajs++){
//                System.out.println("Skaitlis " + pirmskaitlis + "; dalītājs " + dalitajs + "; atlikums " + pirmskaitlis % dalitajs);
                        if (pirmskaitlis % dalitajs == 0){
                            System.out.println("Skaitlis " + pirmskaitlis + " nav pirmskaitlis.");
                        break;
                    }

                    System.out.println("Skaitlis " + pirmskaitlis + " ir pirmskaitlis.");
                        break;
                }

            }



        //3.uzdevums

        System.out.println("\n3.uzdevums=================================");
        int iterators = 0;
        int iteratorsA = 0;
        int iteratorsB = 0;

       String[] nedela = {"Pirmdiena", "Otrdiena", "Trešdiena", "Ceturtdiena", "Piektdiena", "Sestdiena", "Svētdiena"};
        int[] grupasVecums = {15,20,25,35,50,65,75,11,66};
        char[] burti = {'A','B','C', 'D'};

        //Ar while

        System.out.println("\na.ar while");
        while (iterators < nedela.length){
            System.out.println(nedela[iterators]);
            iterators++;
        }
        while (iteratorsA < grupasVecums.length){
            System.out.println(grupasVecums[iteratorsA]);
            iteratorsA++;
        }
        while (iteratorsB < burti.length){
            System.out.println(burti[iteratorsB]);
            iteratorsB++;
        }

        //Ar do while

        System.out.println("\nb.ar do while");
        int iterarorsVecums = 0;
        int iterarorsNedela = 0;
        int iterarorsBurti = 0;
        do {
            System.out.println(grupasVecums[iterarorsVecums]);
            iterarorsVecums++;
        }
        while (iterarorsVecums < grupasVecums.length);

        do {
            System.out.println(nedela[iterarorsNedela]);
            iterarorsNedela++;
        }
        while (iterarorsNedela < nedela.length);

        do {
            System.out.println(burti[iterarorsBurti]);
            iterarorsBurti++;
        }
        while (iterarorsBurti <burti.length);

        //Ar for loop

        System.out.println("\nc.ar for loop");
        int iteratorsLoopVec;
        int iteratorsLoopNed;
        int iteratorsLoopBur;
        for (iteratorsLoopNed = 0; iteratorsLoopNed < nedela.length; iteratorsLoopNed++){
            System.out.println(nedela[iteratorsLoopNed]);
        }

        for (iteratorsLoopVec = 0; iteratorsLoopVec < grupasVecums.length; iteratorsLoopVec++){
            System.out.println(grupasVecums[iteratorsLoopVec]);
        }

        for (iteratorsLoopBur = 0; iteratorsLoopBur < burti.length; iteratorsLoopBur++){
            System.out.println(burti[iteratorsLoopBur]);
        }

        //Ar for each

        System.out.println("\nd.ar for each");
        for (char burts : burti){
            System.out.println(burts);
        }

        for (int grupasVecumi : grupasVecums){
            System.out.println(grupasVecumi);
        }

        for (String nedelas : nedela){
            System.out.println(nedelas);
        }


        //4.uzdevums

        System.out.println("\n4.uzdevums=================================");
//        Definēt veselu skaitļu masīvu ar izmēru 100, un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem.
//        Visas vērtības, kas ir iekšā masīva, ir nepieciešams izvest uz ekrāna vienā līnijā.

        int[] skaitliSimts = new int[100];

        for(int iteratorsSimts = 0 ; iteratorsSimts < skaitliSimts.length; iteratorsSimts++){
            skaitliSimts[iteratorsSimts] = iteratorsSimts;
        }
        for(int skaitlisPara:skaitliSimts) {
            if (skaitlisPara % 2 == 0) {      // checking for even
                System.out.print(skaitlisPara);
                System.out.print(",");
            }
        }

        //5.uzdevums

        System.out.println("\n5.uzdevums=================================");
        int i,fact = 1;
        int number = 5;//Skaitlis, kuram rēķina faktoriālu
        for(i = 1;i <= number;i++){
            fact = fact * i;
        }
        System.out.println("Skaitļa  "+number+" faktoriāls ir: "+fact);

        //6.uzdevums


        System.out.println("\n6.uzdevums=================================");

        final String PAROLE = "Parole123";
            final int MAX_REIZES = 3;
            boolean IrIelogojies = false;
            int reizes = 0;
            while (reizes < MAX_REIZES && !IrIelogojies){
            System.out.print("Ievadi paroli ");
            String lietotajaParole = scanner.nextLine();

            if (!(lietotajaParole.equals(PAROLE))){
                System.out.println("\nNepareizs PIN, mēģiniet vēlreiz: ");
                reizes++;
            } else {
                System.out.println("\nPIN ir pieņemts, laipni lūdzam atpakaļ!");
                IrIelogojies =true;
                break;
            }
                if (reizes == 3) {
                    System.out.println("\nAtvainojiet, bet jūs esat bloķēts!");
                    break;
                }
        }
        }
}







