//package classRomFour;
//
//import java.time.Instant;
//import java.time.LocalDate;
//
//public class Rinkis {
//    final double PI = 3.14;
//    double radiuss = 4;
//    LocalDate date;
//
//    Rinkis(){
//        System.out.println("Veidoju riņķi....");//tiek izsaukta, kad Main izsauc new Rinkis
//        date = LocalDate.now();
//    }
//
//    Rinkis(double radiuss){ //ja veidosim objektu sRiņķis,
//        this.radiuss = radiuss;   //apzīmē to mainīgo, kas nodefinēts klasē
//
//    }
//
//    public double rinkaLaukums(){
//        return PI * (radiuss * radiuss);
//    }
//
//    public double diametrs(){
//        return radiuss * 2;
//    }
//
//    public void printCreationTime(){
//        Instant instant = date.atStartOfDay(ZoneId.systemDefault()).toInstant();
//        System.out.println(instant);
//
//    }
//
//
//
//
//}
