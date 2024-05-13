package assignment2;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Divide two natural numbers to find out their reminder.");
    System.out.println("Choose your first number: ");
    int q = scanner.nextInt();
    System.out.println("Choose your second number: ");
    int w = scanner.nextInt();
    returnReminder(q,w);
    }

    public static void returnReminder(int number1, int number2)
    {
        System.out.println("The reminder of " + number1 + " and " + number2 + " is the following: " + number1%number2);
    }

}
