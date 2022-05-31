//package classroomThree;
//
//import org.w3c.dom.ls.LSOutput;
//
//import java.util.Scanner;
//
//public class Masivi {
//
//    public static void main(String[] args) {
//
//        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
//        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
//        double[] randomSkaitli = {21.3, 323.2, 528.45};
//
//        System.out.println("Masīva garums ir: " + gadalaiki.length);
//
//        System.out.println(gadalaiki[0]);
//        System.out.println(gadalaiki[1]);
//        System.out.println(gadalaiki[2]);
//        System.out.println(gadalaiki[3]);
////        System.out.println(gadalaiki[4]);
//        System.out.println(fibonacciNumbers[4]);
//
//        //Nomainīt vērtību
//        gadalaiki[1] = "Anda";
//        System.out.println(gadalaiki[1]);
//
//        // Masīvs ar cilvēku vārdiem
//        String[] cilveki = {"Juris", "Pēteris", "Anna"};
//        int[] vecums = {33, 40, 28};
////        System.out.println("Vārds: " + cilveki[0] + "\n" + "Vecums " + vecums[0]);
//        printCilveks(cilveki, vecums, 1);
//
//        //Jauns masīvs
//        String[] germanCars = new String[4];//obligāti jāieliekizmērs vai vērtības
//        germanCars[0] = "Mercedes";
//        germanCars[1] = "Audi";
//        germanCars[2] = "BMW";
//        germanCars[3] = "Opel";
//
////        int iterators = 0;
////        while (iterators<germanCars)
//
//        System.out.println(germanCars[3]);
//
//        //Ievadi skaitli1,ievadi skaitli 2, ievadi skaitli 3
//        int[] mansMasivs = generateArray();
//        System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" + mansMasivs[2]);
//
//    }
//
//    //Var izveidot metodi
//    static void printCilveks(String[] humans, int[] ages, int index) {
//        System.out.println("Vārds: " + humans[index] + "\n" + "Vecums " + ages[index]);
//    }
//
//
//    static int[] generateArray(){;
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi pirmo skaitli...");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli...");
//        int b = scanner.nextInt();
//        System.out.println("Ievadi trešo skaitli...");
//        int c = scanner.nextInt();
//        //int[] skaitluMasivs = {a, b, c};
//        //return skaitluMasivs;
//        return new int[]{a,b,c};
//
//
//        //Cikli; i ir saīsinājums no iterator
//        int i = 0;
//        while (i<5) {
//            System.out.println("I ir: " + i);//ja te apstājas, būs bezgalīgs cikls, tāpēc nākamais
//            i++;//palielina par 1; var rakstīt arī i = i + 1 ;
//        }
//        System.out.println("Cikla izeja");
//
//        //Cits cikls
//        int q = 10;
//        while (q>1){
//            System.out.println("Q ir: " + q);
//            q--; //tas pats, kas q=q-1;
//        }
//
////        while (true){
////            int r = 0;
////            r++;
////            System.out.println(r);//bezgalīgs
//        }
//
//        int[] bingoLotoLaimigieSkaitli={3,5,48,7,6,31};
//    printIntArray(bingoLotoLaimigieSkaitli);
//
//    String[] kartis = {"Pīķis", "Dūzis, "Kalps", "Dāma"};
//        int karts = 0;
//
//       // while (karts.lenght<=2){
//        //while(karts<3){
//        while(karts<kartis.lenght){
//        System.out.println(kartis[karts]);
//        karts++;
//    }
//
//        static int sumPositiveNumbers(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Ieraksti skaitli");
//            int number = scanner.nextInt();
//            int summa = 0;
//            while (number >= 0){
//                summa = summa + number;
//                System.out.println("Ieraksti skaitli");
//                number = scanner.nextInt();
//
//            }
//            System.out.println("Pozitivo skaitlu summa ir: " +summa);
//            return summa;
//        }
////        int counter = 0;//jo masīvi sākas ar 0
////        while(counter < bingoLotoLaimigieSkaitli.lenght){
////        System.out.println(bingoLotoLaimigieSkaitli[counter]);
////        counter++;
//
//        static void  printIntArray(int[] randomMasivs){
//            int counter = 0;//jo masīvi sākas ar 0
//            while(counter < bingoLotoLaimigieSkaitli.lenght){
//                System.out.println(randomMasivs[counter]);
//                counter++;
//            }
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//
//            }
//
//            for (int i = 2; i <=1000 ; i=i+2) {//drukā visus pāra līdz 1000
//                System.out.println(i);
//
//            }
//            for (int i = 0; i < gadalaiki.length ; i++) { //šis i nav tas pats kas iepriekš, jo darbojas cikla ietvaros
//                System.out.println(gadalaiki[i]);
//            }
//
//            for (int i = 0; i < 1000 ; i++) {
//                System.out.println("es esmu labs students");
//
//            }
//
//            //Piemērs ar ciematu
//            for (int i = 1; i <= 50 ; i++) {
//                System.out.println(i);
//                if((i%3==0) || (i%5==0) || (i==13)){
//                    System.out.println("Šie numuri neder " + i);
//                }else {
//                    System.out.println("Šis numurs der " + i);
//                }
//
//            }
//
//            int[] skaitli = {1,3,4,6,1,2,3,5,1,2,5};
//            int summa;
//            //for each
//            for(int j : skaitli){
//                System.out.println(j);
//                summa = summa + j;
//                System.out.println(summa);
//
//                String[] vardi = {"ābols", "bumbieris", "Burkāns"};
//                for (String vards : vardi ){
//
//                }
//            }
//        }
//
//
//
//
//
//    }
//}
