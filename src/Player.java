public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void updateScore(int points) {
        if (points == -1) {
            score = 0;
        }
        else {
            score += points;
        }
    }

    public int getScore() {
        return score;
    }
}
