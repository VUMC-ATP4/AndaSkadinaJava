package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        //Premium member
        Customer customerOne = new Customer("Kārlis");
        customerOne.setMember(true);
        customerOne.setMemberType("Premium");

        //Gold Member
        Customer customerTwo = new Customer("Pēteris");
        customerTwo.setMember(true);
        customerTwo.setMemberType("Gold");

        //no member at all
        Customer customerThree = new Customer("Zane");
        customerThree.setMember(false);

        //Silver Member
        Customer customerFour= new Customer("Baiba");
        customerFour.setMember(true);
        customerFour.setMemberType("Silver");


        Visit v1 = new Visit(customerOne, new Date());
        Visit v2 = new Visit(customerTwo, new Date());
        Visit v3 = new Visit(customerThree, new Date());
        Visit v4 = new Visit(customerFour, new Date());


        v1.setProductExpense(20.0);
        v1.setServiceExpense(40.0);
        System.out.println(v1);
        System.out.println("Total expense made by " + v1.getName() + " = " + v1.getTotalExpense());

        v2.setProductExpense(20.0);
        v2.setServiceExpense(40.0);
        System.out.println(v2);
        System.out.println("Total expense made by " + v2.getName() + " = " + v2.getTotalExpense());


        v3.setProductExpense(20.0);
        v3.setServiceExpense(40.0);
        System.out.println(v3);
        System.out.println("Total expense made by " + v3.getName() + " = " + v3.getTotalExpense());

        v4.setProductExpense(20.0);
        v4.setServiceExpense(40.0);
        System.out.println(v4);
        System.out.println("Total expense made by " + v4.getName() + " = " + v4.getTotalExpense());

    }
}

