package classroomFive.inhetirence;

public class Dog extends Animal{ //uzbīda peli, un create constructoru izvēlas

    public Dog(int legCount,String name) {
        super(legCount,name);
    }

    //Metodes pārrakstīšana
    @Override
    public void makeSound(){
        System.out.println("Es esmu suns. Vau, vau, vau....");
    }
}
