package Aula.Code.Lista;

import java.text.*;
import java.time.LocalDate;

public class Time {

    static Format fort = new NumberFormat() {
        @Override
        public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
            return null;
        }

        @Override
        public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
            return null;
        }

        @Override
        public Number parse(String source, ParsePosition parsePosition) {
            return null;
        }
    } ;

    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int timeInSeconds){
        this.hour = ((timeInSeconds/60)/60) - hour*60 ;
        this.minute = timeInSeconds/60 - hour*60;
        this.second = timeInSeconds - ((hour * (int) Math.pow(60,2)) + (minute*60));
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Horário: "+hour+":"+minute+":"+second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}
