package assignment2;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the sum of a two digit natural number");
        System.out.println("Provide a two digit natural number: ");
        int n = scanner.nextInt();
        printSum(n);


    }

    public static void printSum(int number)
    {
        int sum = 0;

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Result: " + sum);
    }
}
