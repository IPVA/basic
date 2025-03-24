package basic.javacore.Kenum.test;

import basic.javacore.Kenum.domain.Customer;
import basic.javacore.Kenum.domain.CustomerType;
import basic.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer01 = new Customer("Person1", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer02 = new Customer("Person2", CustomerType.COMPANY, PaymentType.CREDIT);
        Customer customer03 = new Customer("Person3", CustomerType.START_UP, PaymentType.CREDIT);


        System.out.println(customer01);
        System.out.println(customer02);
        System.out.println(customer03);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        System.out.println(CustomerType.getByReportValue("Individual"));
        CustomerType customerType = CustomerType.getByReportValue("Individual");
        System.out.println(customerType.getReportValue());
    }
}
