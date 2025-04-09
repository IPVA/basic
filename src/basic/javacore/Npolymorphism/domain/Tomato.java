package basic.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.6;
    public Tomato(String name, double price) {
        super(name, price);
    }


    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value from tomato");
        return this.price * TAX_PERCENTAGE;
    }

}
