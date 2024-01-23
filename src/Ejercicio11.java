import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");


        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }


        int[] numbers = {10, 20, 30, 40, 50};


        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
