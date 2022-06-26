package homework.claasHomerworkSeven;

public class Main {
    public static void main(String[] args) {
        Triistuuris triistuurisViens = new Triistuuris();
        triistuurisViens.vienMala = 12;
        triistuurisViens.otraMala = 13;
        triistuurisViens.tresaMala = 15;
        System.out.println("Šī trijstūra laukums ir:  " + triistuurisViens.trijsturaLaukums());
        System.out.println("Vai trijstūris ir vienādmalu? " + triistuurisViens.vaiTrijsturisIrVienadmalu());
        System.out.println("Vai trijstūris ir vienādsānu? " +triistuurisViens.vaiTrijsturisIrVienadsanu());

        Triistuuris triistuurisDivi = new Triistuuris(2,2,2);


        System.out.println("\nŠī trijstūra laukums ir:  " + triistuurisDivi.trijsturaLaukums());
        System.out.println("Vai trijstūris ir vienādmalu? " + triistuurisDivi.vaiTrijsturisIrVienadmalu());
        System.out.println("Vai trijstūris ir vienādsānu? " + triistuurisDivi.vaiTrijsturisIrVienadsanu());

    }
}
