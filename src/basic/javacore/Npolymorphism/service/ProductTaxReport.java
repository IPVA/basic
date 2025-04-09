package basic.javacore.Npolymorphism.service;
import basic.javacore.Npolymorphism.domain.Computer;
import basic.javacore.Npolymorphism.domain.Tomato;
public class ProductTaxReport {

    public static void generateComputerTaxReport(Computer computer) {
        System.out.println("Starting Computer Tax Report....");
        double taxValue = computer.calculateTaxValue();
        System.out.println("Computer name: " + computer.getName());
        System.out.println("Computer Price: " + computer.getPrice());
        System.out.println("Tax Value: " + taxValue);
    }

    public static void generateTomatoTaxReport(Tomato tomato) {
        System.out.println("Starting Tomato Tax Report....");
        double taxValue = tomato.calculateTaxValue();
        System.out.println("Computer name: " + tomato.getName());
        System.out.println("Computer Price: " + tomato.getPrice());
        System.out.println("Tax Value: " + taxValue);
    }
}
