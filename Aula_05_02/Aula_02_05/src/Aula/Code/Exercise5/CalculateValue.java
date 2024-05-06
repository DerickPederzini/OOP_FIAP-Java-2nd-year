package Aula.Code.Exercise5;

import java.time.LocalDateTime;

public class CalculateValue{

    private final LocalDateTime begin;
    private final LocalDateTime end;

    public CalculateValue(LocalDateTime begin, LocalDateTime end) {
        this.begin = begin;
        this.end = end;
    }

    public double calculateValue(Vehicle vehicle){

        if(vehicle.getType().equalsIgnoreCase("suv")){
            CalculateValueSuv calculate = new CalculateValueSuv(begin, end);
            return calculate.calculate();
        }else{
            CalculateValueCar calculate = new CalculateValueCar(begin, end);
            return calculate.calculate();
        }

    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}
