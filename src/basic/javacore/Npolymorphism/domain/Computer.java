package basic.javacore.Npolymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }


    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value from Computer");
        return this.price * TAX_PERCENTAGE;
    }
}
