package basic.javacore.Npolymorphism.test;
import basic.javacore.Npolymorphism.domain.Computer;
import basic.javacore.Npolymorphism.domain.Product;
import basic.javacore.Npolymorphism.domain.Tomato;
import basic.javacore.Npolymorphism.service.ProductTaxReport;

public class ProductTest01 {
    public static void main(String[] args) {
        Tomato tomato1 = new Tomato("normal tomato", 2.50);
        Computer computer1 = new Computer("PC_1", 3500);
        Product product1 = new Computer("Television 50\"", 2600);
        ProductTaxReport.generateTaxReport(computer1);
        System.out.println("_____________________________________________________________________________________________");
        ProductTaxReport.generateTaxReport(tomato1);
        System.out.println("_____________________________________________________________________________________________");
        ProductTaxReport.generateTaxReport(product1);
        System.out.println("_____________________________________________________________________________________________");
    }
}
