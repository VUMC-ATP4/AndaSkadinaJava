package classroomFive.inhetirence;

public class Animal {  //superklases nemanto neko no apakšklases
    int legCount;
    String name;

    public Animal(int legCount,String name) { //ar peles labo Generate/ Construkcotr un izveidos šos divus
        this.legCount = legCount;
        this.name = name;
    }
    public void printLegCount(){
        System.out.println(name + " kāju skaits ir: " + legCount);//visas klases, kas būs sasaistītas ar animal klasi, varēs izmantot šo
                                                            //metodi



    }
    public void makeSound(){
        System.out.println("Es esmu dzīvnieks. Arhggggg....");
    }









}
