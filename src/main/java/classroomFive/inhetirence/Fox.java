package classroomFive.inhetirence;

public class Fox {
    String name;
    int legCount;

    public Fox(String name, int legCount) {
        this.name = name;
        this.legCount = legCount;
    }

    public void printLegCount() {
        System.out.println(name + " kāju skaits ir: " + legCount);

    }
}
