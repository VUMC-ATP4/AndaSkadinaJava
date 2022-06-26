package classroomFive.encapsu;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();

        //putns.name = "Pollija"; pēc izmaiņas uz private name ir sarkans, to aizvieto ar nākamiem diviem
        putns.setVards("Pollija");
        System.out.println(putns.getVards());

        //putns.colour = "Zila";//nevra piekļūt, jo privāta klase
        putns.printText();
        //putns.printTextSpecial();// šo nevar te izsaukt, jo privāta.
        putns.defaultMethodExample();
        Human cilveks = new Human();
//        int vecum = -1;
//        if (vecum<=0){
//            System.out.println("Vecums nedrīkst būt mazķas par 0");
//        }
        cilveks.setAge(2);
        System.out.println(cilveks.getAge());
        cilveks.setHeight(167);
        System.out.println(cilveks.getHeight());
        cilveks.setName("Jānis");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Uzulnieks");
        System.out.println(cilveks.getSurname());


        //Method overload
        Matematika matematika = new Matematika();

        System.out.println( matematika.add(30,20));
        System.out.println(matematika.add(1.2,1.3));
        matematika.paraditTekstu("Juris");
        matematika.paraditTekstu("Juris",true);
        matematika.paraditTekstu("Anna",false);



    }


}
