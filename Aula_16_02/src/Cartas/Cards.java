package Cartas;

public class Cards {

    private int valor;
    private char naipe;

    public Cards(int valor, char naipe) {
        setValor(valor);
        setNaipe(naipe);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        if(valor < 1 || valor > 13)
            System.exit(0);
        this.valor = valor;
    }

    public char getNaipe() {
        return naipe;
    }

    private void setNaipe(char naipe) {
        if(naipe != '♠' && naipe != '♣' && naipe != '♦' && naipe != '♥') System.exit(0);
        this.naipe = naipe;
    }

    @Override
    public String toString(){
        if(valor == 1) return "A" + getNaipe();
        if(valor == 11) return "J" + getNaipe();
        if(valor == 12) return "Q" + getNaipe();
        if(valor == 13) return "K" + getNaipe();
        return valor + "" + getNaipe();
    }


}
