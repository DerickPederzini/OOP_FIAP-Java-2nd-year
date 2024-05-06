package Aula.Code.Exercise5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParkingAccount {


    private Vehicle vehicle;
    private LocalDateTime begin;
    private LocalDateTime end;
    private CalculateValue parkingValue;

    public ParkingAccount(){

    }

    public ParkingAccount(Vehicle vehicle, LocalDateTime begin, LocalDateTime end) {
        this.vehicle = vehicle;
        this.begin = begin;
        this.end = end;
        this.parkingValue = new CalculateValue(begin, end);
    }

    public double calculateValue(){

        return this.parkingValue.calculateValue(this.vehicle);

    }


}
