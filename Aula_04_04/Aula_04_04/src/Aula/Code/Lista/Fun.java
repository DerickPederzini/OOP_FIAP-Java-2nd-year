package Aula.Code.Lista;

public class Fun {

    public static String thisIsStatic;

    static {

        thisIsStatic = "Yo";
        thisIsStatic = "Hey";
    }

    public void display(){
        System.out.println(getThisIsStatic());
    }

    public static String getThisIsStatic() {
        return thisIsStatic;
    }
}
