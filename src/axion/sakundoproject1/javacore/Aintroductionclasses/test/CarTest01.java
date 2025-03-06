package axion.sakundoproject1.javacore.Aintroductionclasses.test;
import axion.sakundoproject1.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "Hyundai Creta";
        car1.model = "Hyundai";
        car1.year = 2014;

        Car car2 = new Car();
        car2.name = "Chevrolet Tracker";
        car2.model = "Chevrolet";
        car2.year = 2001;

        System.out.printf("Name:%s. Model:%s. Year:%d\n",car1.name, car1.model, car1.year);
        System.out.printf("Name:%s. Model:%s. Year:%d", car2.name, car2.model, car2.year);


    }
}
