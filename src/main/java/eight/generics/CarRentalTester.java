package eight.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CarRentalTester {
    public static void main(String[] args) {
        Rental<Car> carRental= new Rental<>();
        System.out.println("Initial Car rental store");
        carRental.rent();

        //now adding cars
        carRental.setElements(new ArrayList<>(Arrays.asList(new Car("seltos",2021) ,new Car("Mg",2022))));
        Car car=carRental.rent();
        System.out.println(car.getModel()+"  "+ car.getName());

    }
}
