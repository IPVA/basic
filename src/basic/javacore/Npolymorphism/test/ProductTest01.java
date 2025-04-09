package basic.javacore.Npolymorphism.test;
import basic.javacore.Npolymorphism.domain.Computer;
import basic.javacore.Npolymorphism.domain.Tomato;
import basic.javacore.Npolymorphism.service.ProductTaxReport;

public class ProductTest01 {
    public static void main(String[] args) {
        Tomato tomato1 = new Tomato("normal tomato", 2.50);
        Computer computer1 = new Computer("PC_1", 3500);
        ProductTaxReport.generateComputerTaxReport(computer1);
        System.out.println("_____________________________________________________________________________________________");
        ProductTaxReport.generateTomatoTaxReport(tomato1);

    }
}
