import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tuna = 5;
        System.out.print("Enter an integer: ");
        int bass = s.nextInt();

        // Shorthand Operators
        tuna += bass;
        System.out.println(tuna);
        tuna -= bass;
        System.out.println(tuna);
        tuna *= bass;
        System.out.println(tuna);
        tuna /= bass;
        System.out.println(tuna);
        System.out.println(tuna++);
        System.out.println(++tuna);
        System.out.println(tuna--);
        System.out.println(--tuna);
    }
}
