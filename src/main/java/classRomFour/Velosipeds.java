package classRomFour;

public class Velosipeds {
    int atrums = 0;
    int atrumi = 21;//pec noklusejuma 21
    String nosaukums = "Specialized";
    String krasa = "Zaļa";
    int svarsGramos;
    double rataIzmers;
    String bremzuTips = " ";

    public void bremzet(){
        //ja bremžu tips ir V, tad ātrums-1, ja disku tad-3
        if(bremzuTips.equals("V-veida")){

            atrums = atrums -1;
        }else  if (bremzuTips.equals("Disku")){
            atrums  = atrums - 3;
        }else {
            atrums = atrums -1;
        }

      //  atrums--;//atrums = atrums-2 - ja par 2

    }

    public void spiedPedalus(){
        atrums++;
    }





}
