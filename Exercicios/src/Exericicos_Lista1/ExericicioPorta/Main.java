package Exericicos_Lista1.ExericicioPorta;

public class Main {
    public static void main(String[] args) {

        Porta [] vector = new Porta[20];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Porta(i);

            vector[i].changeDoorIfEven();

            if(vector[i].isState() == true) System.out.println(vector[i].getNumber()+" "+vector[i].isState());

            //System.out.println(vector[i].getNumber());
        }
    }
}
