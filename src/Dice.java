import java.util.Random;

public class Dice {
    private int value;
    private Random random;

    public Dice() {
        random = new Random();
        value = random.nextInt(6) + 1;
    }

    private void roll() {
        value = random.nextInt(6) + 1;
    }

    private int getValue() {
        return value;
    }
}
