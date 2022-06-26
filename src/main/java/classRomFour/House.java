package classRomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    Cena cena;

    boolean irStavvieta;

    int skatijumuSkaits;

    public double cenaKvadratmetra(){
        return cena.cena/platiba;
    }

    public void printetAdresi(){
        System.out.println("Mājas adrese ir " + ielasNosaukums + " " + majasNumurs);

    }

    public void papildusInfo(){
        System.out.println("Stāvu skaits ir " + stavuSkaits);
        System.out.println("Ieeju skaits ir " + ieejuSkaits);
        System.out.println("Istabu skaits ir " + istabuSkaits);
        System.out.println("Platība ir " + platiba + " m2");
        System.out.println("Vai ir stāvvieta? " + irStavvieta);
        System.out.println("Cena ir " + cena );
        System.out.println("Cena kvadrātmetrā ir " + cena.cena/platiba );
        }









}
