public class Game {
    private Player[] players = new Player[5];
    private int numPlayers;
    private Dice dice;

    public Game() {
        numPlayers = 0;
        dice = new Dice();
    }

    public Player getPlayer(int pos) {
        return players[pos];
    }

    public void addPlayer(Player player) {
        players[numPlayers] = player;
        numPlayers++;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public boolean gameOver() {
        if (players[0].getScore() > 99) {
            return true;
        }
        else if (players[1].getScore() > 99) {
            return true;
        }
        return false;
    }

    public void playRound() {
        for (int i=0; i<getNumPlayers(); i++) {
            Player player = getPlayer(i);

            dice.roll();
            int roll1 = dice.getValue();
            dice.roll();
            int roll2 = dice.getValue();

            if (roll1 != 1 && roll2 != 1) {
                int totalScore = player.getScore();
                int gainedScore = roll1 + roll2;
                player.updateScore(totalScore + gainedScore);
            }
            else if (roll1 == 1 && roll2 == 1) {
                player.updateScore(0);
            }

            displayPlayerTurn(player);
        }
    }

    public void displayPlayerTurn(Player player) {
        System.out.println(player.getName() + " has " + player.getScore() + " points");
    }
}
