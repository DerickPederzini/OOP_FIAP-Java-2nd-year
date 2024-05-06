package Aula.Code.Exercise5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateValueCar extends CalculateValue{

    public CalculateValueCar(LocalDateTime begin, LocalDateTime end) {
        super(begin, end);
    }

    public double calculate() {

        long test = ChronoUnit.HOURS.between(super.getBegin(), super.getEnd());

        if(test <= 360){
            if(test <= 1){
                return 9;
            }
            if(test <= 6){
                return 9 + (super.getEnd().getHour() - super.getBegin().getHour()) * 1.5 - 1;
            }
            return 15 * (super.getEnd().getDayOfMonth() - super.getBegin().getDayOfMonth()) ;
        }else{
            return 350;
        }

    }
}
