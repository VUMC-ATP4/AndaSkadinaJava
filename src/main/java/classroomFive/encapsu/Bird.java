package classroomFive.encapsu;

public class Bird {
    //public String name; //ja private String name, tad nebūs pieejams citā klasē
    private String colour;
    //Uztaisa kā private un pieliek set un get, tad Main klasē pamaina
    private String name = "Pollija";
    public void setVards(String vards){
        this.name = vards;
    }
    public String getVards(){
        return name;
    }

    public void printText(){  //publiska, jo varēs piekļūt no citām klasēm
        System.out.println("Šī ir publiska metode");
        System.out.println("Printēju putnu");
        printTextSpecial();
    }

    private void printTextSpecial(){  // šo nevarēs izsaukt no citas klases
        System.out.println("Šī ir privāta metode");
    }

    void defaultMethodExample(){  //var piekļūt pakotnes ietvaros
        System.out.println("Šī ir default metode");
    }
}
