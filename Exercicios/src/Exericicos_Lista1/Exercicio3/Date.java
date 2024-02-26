package Exericicos_Lista1.Exercicio3;

import java.time.LocalDate;
import java.time.Month;

public class Date {

    private LocalDate date;

    public Date(LocalDate date) {

        if(date.getYear() > 2019 || LocalDate.now().getYear() - date.getYear() > 120){
            throw new RuntimeException("Fakeando a idade né rapaz");
        }

        this.date = date;
    }


    public String toString(){
        return getDate().getDayOfMonth()+"/"+getDate().getMonthValue()+"/"+getDate().getYear();
    }

    public LocalDate getDate() {
        return date;
    }


}
