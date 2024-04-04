package Aula.Code.Lista;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Util {

    public int calculateAge(LocalDate dateTime){

        return LocalDate.now().getYear() - dateTime.getYear();

    }

}
