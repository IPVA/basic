package basic.javacore.Npolymorphism.test;

import basic.javacore.Npolymorphism.domain.Computer;
import basic.javacore.Npolymorphism.domain.Tomato;
import basic.javacore.Npolymorphism.service.ProductTaxReport;

public class ProductTest02 {
    public static void main(String[] args) {
        Tomato tomato1 = new Tomato("normal tomato", 2.50);
        Computer computer1 = new Computer("PC_1", 3500);
        tomato1.setBestConsumedBefore("06/05/2025");
        ProductTaxReport.generateTaxReport(tomato1);
        System.out.println("--------------------------------------------------------------");
        ProductTaxReport.generateTaxReport(computer1);

    }
}
