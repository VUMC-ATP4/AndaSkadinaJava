package homeworkTwo;

public class HomeWorkTwo {

    public static void main(String[] args) {

        System.out.println("1.uzdevums");

        int x = 6;
        System.out.println("X ir = " + x);
        System.out.println("Vai x ir pozitīvs? " + (x > 0)); // true
        System.out.println("Vai x ir negatīvs? " + (x < 0)); //false
        System.out.println("Vai x ir > 5 un <= 10? " + (x > 5 && x <= 10)); //true
        System.out.println("Vai x nav <= 5 un < 10? " + (!(x <= 5) && x < 10)); //true
        System.out.println("Vai x = 0 vai = 10? " + (x == 0 || x == 10)); //false
        System.out.println("Vai x * x > 10? " + (x * x > 10)); //true

        System.out.println("\n2.uzdevums");
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
            case 5:
                System.out.println("Maijs");
            default:
                System.out.println("Mēnesis " + month + " nav definēts");
        }

        System.out.println("\n3.uzdevums");
        int a = 8;
        int b = 9;
        int c = 8;

        if (a > b && a > c) {
            System.out.println("Lielākais skaitlis ir a, un tas ir: " + a);
        } else if (b > a && b > c) {
            System.out.println("Lielākais skaitlis ir b, un tas ir: " + b);
        } else if (a == b && a == c) {
            System.out.println("Visi trīs skaitļi ir vienādi");
        } else {
            System.out.println("Lielākais skaitlis ir c, un tas ir: " + c);
        }


        System.out.println("\n4.uzdevums");

        String krasa = "balts";
        if (krasa.equals("sarkans")) {
            System.out.println("Stāvi, sarkans!");
        } else if (krasa.equals("dzeltens")) {
            System.out.println("Gaidi, dzeltens!");
        } else if (krasa.equals("zaļš")) {
            System.out.println("Ej, zaļš!");
        } else {
            System.out.println("Kas tā par krāsu luksoforā? " + krasa);
        }


    }
}

