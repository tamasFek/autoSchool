package assignment1;
import com.welcome.Hello;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a name: ");
        String name = scanner.nextLine();

        Hello helloObj = new Hello();
        helloObj.setupName(name);
        helloObj.welcome();
        System.out.println("Hello World!");
        helloObj.byeBay();

    }
}
