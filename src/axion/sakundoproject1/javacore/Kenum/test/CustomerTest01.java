package axion.sakundoproject1.javacore.Kenum.test;

import axion.sakundoproject1.javacore.Kenum.domain.Customer;
import axion.sakundoproject1.javacore.Kenum.domain.Customer.PaymentType;
import axion.sakundoproject1.javacore.Kenum.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer01 = new Customer("Person1", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer02 = new Customer("Person2", CustomerType.COMPANY, PaymentType.CREDIT);
        Customer customer03 = new Customer("Person3", CustomerType.START_UP, PaymentType.CREDIT);


        System.out.println(customer01);
        System.out.println(customer02);
        System.out.println(customer03);

    }
}
