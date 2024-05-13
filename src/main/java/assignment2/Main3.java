package assignment2;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("Round a number n to the nearest integer.");
        System.out.println("Provide a real number with a non-zero fractional part: ");

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        printRoundedNumber(n);

    }

    public static void printRoundedNumber(double number)
    {
        System.out.println("The nearest integer: " + Math.round(number));
    }

}
