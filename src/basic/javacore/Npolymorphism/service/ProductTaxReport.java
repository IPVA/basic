package basic.javacore.Npolymorphism.service;
import basic.javacore.Npolymorphism.domain.Product;

public class ProductTaxReport {

    public static void generateTaxReport(Product product) {
        System.out.println("Starting Tax Report....");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Tax Value: " + taxValue);
    }
}
