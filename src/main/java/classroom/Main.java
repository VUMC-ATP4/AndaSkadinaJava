package classroom;

public class Main {
//    sis attiecas uz visām klasēm
    int timeout = 10;

    public static void main(String[] args) {
        System.out.println("Ārā spīd saule");

        //Integer - LV:Vesels skaitlis; x ir mainīgais
        int x = 5;
        int y = 10;
        int q = -10;
        double temperatura = -20.4;

        System.out.println("x ir vienāds ar:");
        System.out.println(x);
        System.out.println("y ir vienāds ar:");
        System.out.println(y);
        System.out.println("x+y ir vienāds ar:");
        System.out.println(x+y);

//        [Mainīgā tips] [Mainīgā nosaukums] = [Vērtība];
//        Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā 'String'

        String sunaVards = "Reksis";
        int sunaVecums = 10;
//        Daļskaitļi tiek definēti ar mainīgā tipu double vai float. Double var būt arī vesels, bet int nevar būt daļskaitlis
        double sunaSvars = 15.5;

        String sunaSkirne = "VAS";
//        Jā (true)nē(false))jautājums tiek definēts ar mainīgā tipa boolean.
        boolean vaiMansSunsIrIzsalcis = true;
//        Vienu simbolu definē ar mainīgā tipu char
        char sunaDzimums = 'M';
        char currency = '$';
        int sunaCena = 100;

        System.out.println("Suņa Vārds: "+ sunaVards);
        System.out.println("Suņa Vecums: "+ sunaVecums);
        System.out.println("Suņa Svars: "+ sunaSvars);
        System.out.println("Suņa Šķirne: "+ sunaSkirne);
        System.out.println("Vai suns ir izsalcis?: "+ vaiMansSunsIrIzsalcis);
        System.out.println("Suņa Dzimums: "+ sunaDzimums);
        System.out.println("Suņa kucēni maksā: "+ sunaCena + currency);

        byte age = 10;
        short depestSeaLevel = 11000;
        int higestIntNumer= 2140000000;
        long USACountryDebt = 214000000000000L;

        System.out.println(age);
        System.out.println(depestSeaLevel);
        System.out.println(higestIntNumer);
        System.out.println(USACountryDebt);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

//        summa = pirmaisSkaitlis + otraisSkaitlis;
//        System.out.println(pirmaisSkaitlis + "+" + "("+otraisSkaitlis +")"+ "=" +summa);

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
//        int atlikums = pirmaisSkaitlis % otraisSkaitlis;
        int atlikums = 10 % 3;

//        int a = 1;
//        double a = 2
        int b = 4;
        int c = 7;
//        int division = b/a
// Ja dalītais un dalāmais ir veseli, dalīs veselos. Ja kaut viens decimāls, tad arī dalījums būs decimaļs
//        System.out.println("#########" + b/a);
        int vienadojums = 5+5*2;
//        int vienadojums = -(5+5)*2;

//        Pielāgošana
//        System.out.println((double) b);
//        System.out.println((int) a);

//        System.out.println("Ja atlikums ir 0, tad para skaitlis" +a%2);



        System.out.println("starp" + starpiba);
        System.out.println("dal" + dalijums);
        System.out.println("reiz" + reizinajums);
        System.out.println("atl" + atlikums);









    }

    public static void manametode() {

    }

}
