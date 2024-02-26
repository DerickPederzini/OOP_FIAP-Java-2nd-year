package Aulinha.Code.ClassContent;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Dog roger = new Dog("Small", "Roger", "Lhasa Apso", LocalDate.of(2015, 06, 02));
        Dog rogers = new Dog("Small", "Roger", "Lhasa Apso", new String[] {"Encarar", "Bola", "Carinho"}, LocalDate.of(2015, 06, 02));

        roger.bark();
        roger.eat();

        System.out.println(roger.getBirthday());
        rogers.Reaction("Bola");

    }
}
