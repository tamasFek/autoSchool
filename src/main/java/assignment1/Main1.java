package assignment1;
import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        printHelloName();
    }

    public static void printHelloName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }

}
