package homework;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Mans Java mājasdarbs ");


        String valstsNosaukums = "Latvija";
        int iedzivotajuSkaits = 1893223;
        int valstsPlatiba = 64589;
        String platibasMervieniba = "km2";
        String valstsGalvaspilseta = "Rīga";
        String valstsValoda = "latviešu";
        boolean vaiESdalibvalsts = true;
        char valstsValuta = '€';

        System.out.println("Valsts nosaukums: "+ valstsNosaukums);
        System.out.println("Iedzīvotāju skaits: "+ iedzivotajuSkaits);
        System.out.println("Valsts platība: "+ valstsPlatiba + " " + platibasMervieniba);
        System.out.println("Valsts galvaspilsēta: "+ valstsGalvaspilseta);
        System.out.println("Valsts valoda: "+ valstsValoda);
        System.out.println("Vai valsts ir ES dalībvalsts?: "+ vaiESdalibvalsts);
        System.out.println("Valsts valūta: "+ valstsValuta);

        System.out.println("Mana dzimtene ir" + " " + valstsNosaukums + " un tajā dzīvo " + iedzivotajuSkaits + " iedzīvotāju" + ".");
        System.out.println("Savukārt tās platība ir" + " " + valstsPlatiba + " " + platibasMervieniba + ", bet tās galavspilsēta ir " + valstsGalvaspilseta + "." );


        // Trīs piemēri uz katru aritmētisko operatoru


        int pirmaisSkaitlis = 40;
        int otraisSkaitlis = 15;

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        int summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;


        System.out.println("\n\nTālāk sekos trīs piemēri katram aritmētiskajam operatoram.");
        System.out.println("\n1.piemērs. Ja pirmais skaitlis ir " + pirmaisSkaitlis + ", bet otrais skaitlis ir " + otraisSkaitlis + ", tad:");
        System.out.println("\nStarpība = " + starpiba);
        System.out.println("Summa = " + summa);
        System.out.println("Dalījums = " + dalijums);
        System.out.println("Reizinājums = " + reizinajums);
        System.out.println("Atlikums = " + atlikums);

        int a = 100;
        int b = 125;

        System.out.println("\n2.piemērs.");
        System.out.println(a + " - " + b + " = " + (b-a));
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " / " + b + " = " + a/b);
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(b + " % " + a + " = " + (b%a));

        System.out.println("\n3.piemērs.");
        System.out.println("((( " + a + " + " + b + ")" + " / " + a + ")" + " * " + b + " - " + a + "))" + " = " + (((a+b)/a)*b-a));


        System.out.println("Ja b dala ar 2, tad atlikums ir = " + (int)b%2);








    }
}
