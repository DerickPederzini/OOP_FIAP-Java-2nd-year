import java.nio.channels.AsynchronousChannel;
import java.util.*;

public class Enquete {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Student student = new Student("Derick", 18);

        System.out.println(student.getName());
        System.out.println(student.getHobbies());

        System.out.println(student.ChangeHobbies(2));

    }

}
class Student {

    static Scanner input = new Scanner(System.in);

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private String desiredArea;

    public String getDesiredArea() {
        return desiredArea;
    }
    public void setDesiredArea(String desiredArea) {
        this.desiredArea = desiredArea;
    }

    private ArrayList<String> hobbies;

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    private static String reason;

    public static String getReason() {
        return reason;
    }
    public static void setReason(String reason) {
        Student.reason = reason;
    }

    private Hashtable<Integer, String> dreams;

    public Hashtable<Integer, String> getDreams() {
        return dreams;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.desiredArea = FillDesiredArea();
        this.hobbies = FillHobbies();
    }

    private static void Reason(){
        System.out.println("Why did you choose TI");
        reason = input.next();
    }

    private static String FillDesiredArea(){

        String areaDesejada = "";

        System.out.println("Digite sua Área Desejada");
        areaDesejada = input.next();

        System.out.println("Want to give a reason?");
        char opt = input.next().toLowerCase().charAt(0);

        if(opt == 'y') Reason();

        return areaDesejada;
    }

    private static ArrayList<String> FillHobbies(){

        int count = 0;
        ArrayList<String>hobbies = new ArrayList<String>();

        System.out.println("How many hobbies do you have?");
        count = input.nextInt();

        for(int i = 0; i < count; i++){

            System.out.println("Digite seu hobby numero "+(i+1));
            hobbies.add(input.next());

        }

        return hobbies;
    }

    public ArrayList<String> ChangeHobbies(int index){

        ArrayList<String> hobbies = this.getHobbies();

        this.hobbies = ChangeHobbies(index, hobbies);

        return hobbies;
    }

    private ArrayList<String> ChangeHobbies(int index, ArrayList <String> hobbies){

        System.out.println("Want to remove a hobby? ");
        boolean option = input.nextBoolean();

        if(option) hobbies.remove(index);

        else {
            System.out.println("What new hobby?");
            hobbies.add(input.next());
        }

        return hobbies;
    }

    private Hashtable<Integer, String> FillDreams(){

        System.out.println("How long would it take for your dream to come true? ");
        this.dreams.put(input.nextInt(), ResolveDreams());

        return this.dreams;

    }

    private static String ResolveDreams(){

        String dreams;
        int i = 1;
        boolean check = true;
        Queue<String> options = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        while(check){
            i++;

            if(options.isEmpty()){
                System.out.println("What is your biggest dream?");
                options.add(input.next());
            }else{
                System.out.println("What is your "+(i)+"Biggest Dream");
                options.add(input.next());
            }

            System.out.println("Are there more dreams?");
            check = input.nextBoolean();

        }
        dreams = options.remove();

        return dreams;
    }

}
