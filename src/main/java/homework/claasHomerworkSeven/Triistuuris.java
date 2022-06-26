package homework.claasHomerworkSeven;

public class Triistuuris {
    int vienMala;
    int otraMala;
    int tresaMala;

    Triistuuris() {
        System.out.println("Veidoju trīstūri");
    }

    public Triistuuris(int vienMala, int otraMala, int tresaMala) {
        this.vienMala = vienMala;
        this.otraMala = otraMala;
        this.tresaMala = tresaMala;

    }

    public double trijsturaLaukums() {
        double p = (vienMala + otraMala + tresaMala) / 2;
        return Math.sqrt(p * (p - vienMala) * (p - otraMala) * (p - tresaMala)) ;
    }

    public boolean vaiTrijsturisIrVienadmalu() {
        if (vienMala == otraMala || otraMala == tresaMala || vienMala == tresaMala) {
            return true;

        } else {
            return false;

        }
    }

    public boolean vaiTrijsturisIrVienadsanu() {
        if (vienMala == otraMala || vienMala == tresaMala || otraMala == tresaMala) {
            return true;
        } else {
            return false;
        }


    }
}




