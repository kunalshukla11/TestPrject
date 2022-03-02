package eight.generics.genericClass;

import eight.domain.Bike;
import eight.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class RentalTester {
    public static void main(String[] args) {

        CarRental carRental= new CarRental();
        System.out.println("Initial Car rental store");
        carRental.rent();

        //now adding cars
        carRental.setElements(new ArrayList<>(Arrays.asList(new Car("seltos",2021) ,new Car("Mg",2022))));
        Car car=carRental.rent();
        System.out.println(car.getModel()+"  "+ car.getName());

        System.out.println("-------------------------------------now testing for bikes");
        BikeRental bikeRental = new BikeRental();
        bikeRental.rent();


    }
}
