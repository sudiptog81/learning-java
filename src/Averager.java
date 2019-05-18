import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int marks;
        int average;

        System.out.print("Enter number of subjects studied: ");
        int subjects = s.nextInt();

        for (int i = 0; i < subjects; i++) {
            System.out.print("Marks in Subject " + (i + 1) + ": ");
            marks = s.nextInt();
            total += marks;
        }

        average = total / subjects;
        System.out.print("Average: " + average);
    }
}
