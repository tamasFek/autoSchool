package assignment2;

public class Main4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 5;

        // Update values of a, b, and c as per the given conditions
        a = a + b;
        b = c - (a - b);
        c = a + c;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
    }
}

