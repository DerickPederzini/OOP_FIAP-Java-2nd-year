package Aula.Code.Lista;

public class Main {
    public static void main(String[] args) {

        String [] family = new String[] {"Derick", "Mom", "Dad"};

        Address address1 = new Address("Rua Net, 90", "Tororo", "Brazil", family);
        Address address2 = new Address("Nowhere", "Brazil");
        Address address3 = new Address("Here", "tororo", "Germany");

        Fun stat = new Fun();

        stat.display();

        Time time = new Time();

        time.setTime(5000);

        time.display();

    }
}
