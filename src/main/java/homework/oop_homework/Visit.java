package homework.oop_homework;

import java.util.Date;

public class Visit {

    private double serviceExpense;
    private double productExpense;
    private Customer customer;
    private Date date;

    //double totalExpence = serviceExpense + productExpense;

    //public Visit(String name, Date date) {
    public Visit(Customer customer, Date date){
        //this.customer = new Customer(name);
        this.customer = customer;
       this.date = date;
    }



    //public Date getDate() {return date;    }

    public String getName() {
        return customer.getName();
    }
    public double getServiceExpense() {
        if (!customer.isMember()) {
            return serviceExpense;
        } else {
            return serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
        }
    }

    public double getProductExpense() {
        if (!customer.isMember()) {
            return productExpense;
        } else {
            return productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
        }
    }


    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }
    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer name = " + customer.getName() +
                ", customer member = " + customer.isMember() +
                ", customer member type = " + customer.getMemberType() +
                ", date = " + date +
                ", serviceExpense = " + serviceExpense +
                ", productExpense = " + productExpense +

                '}';
    }
}
