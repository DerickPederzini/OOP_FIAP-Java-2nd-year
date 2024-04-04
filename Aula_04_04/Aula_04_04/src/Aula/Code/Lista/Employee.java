package Aula.Code.Lista;

public class Employee {

    private String name;
    private long code;
    private Profession Profession;
    private double salary;

    public Employee(){

    }

    public Employee(long code) {
        this.code = code;
    }

    public Employee(String name, long code) {
        this(code);
        this.name = name;
    }

    public Employee(String name, long code, Profession profession) {
        this(name, code);
        Profession = profession;
    }

    public void display(){



    }

    public void setProfession(Aula.Code.Lista.Profession profession) {
        Profession = profession;
    }
}
