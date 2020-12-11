import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException {

        System.out.println("Input equation in arabic or roman numbers");
        System.out.println("Input only arabic OR only roman numbers from 1 to 10 / I to X");
        System.out.println("Numbers and char must be divided by spaces:");

        try (Scanner sc = new Scanner(System.in)) {
            String result = new Calculator().calculate(sc.nextLine().trim().toUpperCase().split(" "));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Input error");
        }

    }

}