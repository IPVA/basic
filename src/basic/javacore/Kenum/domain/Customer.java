package basic.javacore.Kenum.domain;

public class Customer {
    private final String name;
    private final CustomerType customerType;

    public enum PaymentType {
        DEBIT, CREDIT
    }

    private final PaymentType paymentType;


    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getReportValue() +
                ", customerTypeDatabaseValue=" + customerType.getDbValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
