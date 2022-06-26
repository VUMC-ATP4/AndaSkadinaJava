//package classRomFour;
//
//public class Main {
//    public static void main(String[] args) {
//        //objekts1
//        House majaViens = new House();
//        majaViens.majasNumurs = 1;
//        majaViens.ielasNosaukums = "Brīvības iela";
//        majaViens.ieejuSkaits = 2;
//        majaViens.istabuSkaits = 6;
//        majaViens.stavuSkaits = 2;
//        majaViens.platiba = 200.23;
//        majaViens.irStavvieta = true;
//        Cena cena1 = new Cena();
//        cena1.cena = 30000;
//        cena1.valuta = '$';
//        majaViens.cena = new Cena();
//
//
//        //objekts 2
//        House majaDivi = new House();
//        majaDivi.majasNumurs = 2;
//        majaDivi.ielasNosaukums = "Gertrudes iela";
//        majaDivi.ieejuSkaits = 3;
//        majaDivi.istabuSkaits = 8;
//        majaDivi.stavuSkaits = 1;
//        majaDivi.platiba = 100.15;
//        majaDivi.irStavvieta = false;
//        Cena cena2 = new Cena();
//        cena2.cena = 30000;
//        cena2.valuta = '$';
//        majaDivi.cena = new Cena();
//
//        majaViens.printetAdresi();
//        majaViens.papildusInfo();
//
//        majaDivi.printetAdresi();
//        majaDivi.papildusInfo();
//
//        majaDivi.ielasNosaukums = "Izmainīts nosaukums";
//        majaDivi.printetAdresi();
//
//        majaDivi.skatijumuSkaits++;
//
//        Velosipeds velosipeds1 = new Velosipeds();
//        Velosipeds velosipeds2 = new Velosipeds();
//        velosipeds2.bremzuTips = "Disku";
//        velosipeds2.spiedPedalus();
//        velosipeds2.spiedPedalus();
//        velosipeds2.spiedPedalus();
//        System.out.println("Velo 2 ātrums ir " + velosipeds2.atrums);
//        velosipeds2.bremzet();
//        velosipeds2.bremzet();
//        System.out.println("Velo 2 ātrums ir " + velosipeds2.atrums);
//        System.out.println(velosipeds1.atrumi);
//        System.out.println(velosipeds1.nosaukums);
//        velosipeds1.atrumi = 28;
//        System.out.println(velosipeds1.atrumi);
//        System.out.println("Velosipeda atrums ir: " + velosipeds1.atrums);
//        velosipeds1.spiedPedalus();
//        System.out.println("Velosipeda atrums ir: " + velosipeds1.atrums);
//        velosipeds1.spiedPedalus();
//        velosipeds1.spiedPedalus();
//        velosipeds1.spiedPedalus();
//        System.out.println("Velosipeda atrums ir: " + velosipeds1.atrums);
//        System.out.println("Priekš ir gājējs");
//        velosipeds1.bremzet();
//        System.out.println("Velosipeda atrums ir: " + velosipeds1.atrums);
//        velosipeds1.bremzet();
//        velosipeds1.bremzet();
//
//        System.out.println("Velosipeda atrums ir: " + velosipeds1.atrums);
//
//        //Automasina autoViens = new Automasina();
//        Automasina autoViens = new Automasina("Opel", 1990, 20000, 500);
//        Automasina auto2= new Automasina("Opel1", 1992, 20005, 600);
//        autoViens.printetAuto();
//        auto2.printetAuto();
//
////        autoViens.marka = "Opel";
////        autoViens.gads = 1993;
////        autoViens.nobraukums = 200000;
////        autoViens.cena  = 1000;
//
////        System.out.println(autoViens.marka + " ; " + autoViens.gads + " ; "  + autoViens.nobraukums + " ; " + autoViens.cena + " ; " + autoViens.cikGaduVeca() );
//
//        //Rinkis rinkis1 = new Rinkis();
//        Rinkis rinkis1 = new Rinkis();
//        Rinkis rinkis2 = new Rinkis();
//
//        //rinkis1.radiuss = 5.34;
//        Rinkis rinkis2 = new Rinkis();
//        rinkis2.radiuss = 15.30;
//        Rinkis rinkis1 = new Rinkis(5,34);
//
//        System.out.println(rinkis1.rinkaLaukums());
//        System.out.println(rinkis2.rinkaLaukums());
//
//        System.out.println(rinkis1.diametrs());
//        System.out.println(rinkis2.diametrs());
//
//        rinkis1.printCreationTime();
//        rinkis2.printCreationTime();
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//}
