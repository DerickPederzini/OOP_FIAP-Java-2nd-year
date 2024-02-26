package Aulinha.Code.ClassContent;

import java.time.LocalDate;
import java.util.Hashtable;

public class Dog {

    private String size;
    private String name;
    private final String race;

    private final LocalDate birthday;

    private String [] reactions;

    private Hashtable<String, Integer> instinct = new Hashtable<String, Integer>();

    public Dog(String size, String name, String race, String [] react, LocalDate birthday) {

        this.size = size;
        this.name = name;
        this.race = race;
        this.birthday = birthday;
        this.reactions = fillReaction(react);

    }

    public Dog(String size, String name, String race, LocalDate birthday) {

        this.size = size;
        this.name = name;
        this.race = race;
        this.birthday = birthday;

    }

    private String [] fillReaction(String [] react){

        String [] typesOfReactions = fillTypesOfReaction(react);

        this.reactions = new String[typesOfReactions.length];

        for (int i = 0; i < typesOfReactions.length; i++) {
            reactions[i] = typesOfReactions[i];
            instinct.put(typesOfReactions[i], 1);
        }

        return reactions;

    }

    public String [] fillTypesOfReaction(String [] types){
        return fillTypesOfReaction(types, types.length);
    }

    private String [] fillTypesOfReaction(String [] types, int size){

        String [] typesReaction = new String[size];

        System.arraycopy(types, 0, typesReaction, 0, size);

        return typesReaction;
    }

    public void bark(){
        System.out.println("WOOF! "+this.getName()+" Is Barking");
    }

    public void eat(){
        System.out.println("Nheck, Nheck, Nheck "+this.getName()+" Is Eating");
    }

    public void Reaction(String reaction){

        if(instinct.containsKey(reaction)) System.out.println("The dog has a Reaction to that!");
        else System.out.println("Dog does not care about you :)");

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public int getBirthday() {
        return LocalDate.now().getYear() - birthday.getYear();
    }
}
