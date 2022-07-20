package homework.oop_homework;

import java.util.Date;

public class Customer {

    private String name;
    private boolean member = false;
    private String memberType;
    private Date date;
    public Customer(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member){
        this.member = member;

    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
