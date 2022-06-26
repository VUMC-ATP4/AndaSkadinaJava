package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW","melns");
        System.out.println("Auto skaits sistēmā:" + auto1.countOfCarsCreatedInSystem);
        Car auto2 = new Car("Mersis","balts");
        System.out.println("Auto skaits sistēmā:" + auto1.countOfCarsCreatedInSystem);
        auto1.klasesApraksts = "šī ir auto klase";
        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName()+ auto2.klasesApraksts);
        auto2.klasesApraksts = "šī ir auto klasexxxxxx";
        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName()+ auto2.klasesApraksts);
        Car.makeSound();
        auto1.makeSound();
        auto2.makeSound();

    }
}
