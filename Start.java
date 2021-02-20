import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите уравнение арабскими или римскими цифрами");
        System.out.println("Разрешаются только целые арабские цифры от 1 до 10 ИЛИ только римские цифры  от I до X");
        System.out.println("Цифры и знаки операций должны быть разделены пробелом:");

        try (Scanner sc = new Scanner(System.in)) {
            String result = new Calculator().calculate(sc.nextLine().trim().toUpperCase().split(" "));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Input error");
        }

    }

}
