package Aula.Code.Exercise5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateValueSuv extends CalculateValue{

    public CalculateValueSuv(LocalDateTime begin, LocalDateTime end) {
        super(begin, end);
    }

    public double calculate(){

        long test = ChronoUnit.HOURS.between(super.getBegin(), super.getEnd());

        if(test <= 360){
            if(test <= 1){
                return 10;
            }
            if(test <= 6){
                return 10 + (super.getEnd().getHour() - super.getBegin().getHour()) * 2 - 1;
            }
            return 22 * (super.getEnd().getDayOfMonth() - super.getBegin().getDayOfMonth()) ;
        }else{
            return 400;
        }
    }

}
