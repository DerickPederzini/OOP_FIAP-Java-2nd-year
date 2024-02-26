package Exericicos_Lista1.Exercicio1;

public class Endereco {

    String street;
    String number;
    String neighbourhood;

    public Endereco(String street, String number, String neighbourhood) {
        this.street = street;
        this.number = number;
        this.neighbourhood = neighbourhood;
    }

    public void display(){
        System.out.println(street+""+ number +""+ neighbourhood);
    }
}
