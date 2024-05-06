package Aula.Code.Exercise5;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime begin = LocalDateTime.of(2024, 5,2, 12,0);
        LocalDateTime end = LocalDateTime.of(2024, 5,18, 15,0);

        Vehicle suv = new Vehicle("Suv");
        Vehicle car = new Vehicle("Car");

        ParkingAccount parkSuv = new ParkingAccount(suv, begin, end);
        ParkingAccount parkCar = new ParkingAccount(car, begin, end);

        System.out.println(parkSuv.calculateValue());
        System.out.println(parkCar.calculateValue());

    }
}
