import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int test = new Scanner(System.in).nextInt();

        if (test == 9) {
            System.out.println("Yes!");
        } else if (test < 9 && test >= 0) {
            System.out.println("No!");
        } else if (test <= 3 || test >= 6) {
            System.out.println("Maybe..");
        } else {
            System.out.println("Else!");
        }

        switch (test) {
            case 1:
                System.out.println("Crawl");
                break;
            case 2:
                System.out.println("Talk");
                break;
            case 3:
                System.out.println("Trouble");
                break;
            default:
                System.out.println("Alien!");
                break;
        }

        System.out.println(test == 10 ? "Ten!" : "Not Ten.");
    }
}
