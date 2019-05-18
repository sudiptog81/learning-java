import java.util.Scanner;

public class BasicAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fNum, sNum, result;
        System.out.print("Enter the first number: ");
        fNum = s.nextDouble();
        System.out.print("Enter the second number: ");
        sNum = s.nextDouble();
        result = fNum + sNum;
        System.out.print("Result: " + result);
    }
}
