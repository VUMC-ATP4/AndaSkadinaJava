package classroomFive.inhetirence;

public class Octopus extends Animal{  //uzbīda peli, un create constructoru izvēlas

    String waterType = "Sālsūdens"; //specifiksā astoņkāja īpašība


    public Octopus(int legCount, String name) {
        super(legCount,name);

    }

    @Override
    public void makeSound(){
        System.out.println("Esmu octopus....");
    }
}
