import java.util.Random;

public class Dice {
    int value;

    public Dice() {
        this.value;
    }

    private void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }

    private int getValue() {
        return this.value;
    }
}
