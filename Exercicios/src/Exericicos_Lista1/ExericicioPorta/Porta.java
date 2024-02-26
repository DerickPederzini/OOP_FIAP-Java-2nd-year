package Exericicos_Lista1.ExericicioPorta;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Porta {

    private int number;
    private boolean state;

    public Porta(int number) {
        this.number = RandomGenerator.getDefault().nextInt(120);
        this.state = false;
    }

    public void changeDoorIfEven(){

        if(this.getNumber() % 2 == 0){
            this.state = true;
        }

    }

    public void changeDoorState(){
        if(this.state == false) {
            this.state = true;
        }
        else if (this.state == true){
            this.state = false;
        }
    }

    public int getNumber() {
        return number;
    }

    public boolean isState() {
        return state;
    }
}
