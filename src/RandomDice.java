import java.util.Random;

public class RandomDice {
    public static void main(String[] args) {
        Random r = new Random();

        int num;

        for (int i = 0; i < 10; i++) {
            num = r.nextInt(6) + 1;
            System.out.println("Dice Output: " + num);
        }
    }
}
