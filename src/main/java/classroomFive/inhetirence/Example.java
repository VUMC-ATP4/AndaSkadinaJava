package classroomFive.inhetirence;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4,"Reksis");
        Octopus octopus1 = new Octopus(8,"Aste");
        Chicken chicken1 = new Chicken(2,"Baltā");
        Chicken vistaArVienuKaju = new Chicken(1, "Melnā");

        dog1.printLegCount();
        octopus1.printLegCount();
        chicken1.printLegCount();
        vistaArVienuKaju.printLegCount();
        Animal dzivnieks = new Animal(4, "Dzīvnieks");
        dzivnieks.printLegCount();

        System.out.println(octopus1.waterType);//no Octopus klases

        Fox lapsa = new Fox("Kūmiņš",4);

        Animal[] dzivnieki = {dog1,octopus1,vistaArVienuKaju,chicken1,dzivnieks}; //lapsu te nevar ielikt, jo lapsa nav salinkota ar Animal

        for (int i = 0; i < dzivnieki.length; i++) {
            dzivnieki[i].printLegCount();
            
        }
        dog1.makeSound();
        chicken1.makeSound();
        octopus1.makeSound();

    }

    }

