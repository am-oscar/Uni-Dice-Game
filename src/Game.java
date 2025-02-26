public class Game {
    private Player[] players = new Player[5];
    private int numPlayers;
    private Dice dice;

    public Game() {
        numPlayers = 0;
        /* I'm using one dice and rolling it twice in playRound(). I'm not using a list because
         * this is simple, easy, readable and not much is repeated. If more dice are needed at
         * some point, it's not hard to turn it into a list
         */
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
        for (int i=0; i<getNumPlayers(); i++) {
            Player player = getPlayer(i);

            if (player.getScore() > 99) {
                return true;
            }
        }
        return false;
    }

    public void playRound() {
        for (int i=0; i<getNumPlayers(); i++) {
            Player player = getPlayer(i);

            // I decided not to put them in a list because it's trivial to do and the repetition is small
            dice.roll();
            int roll1 = dice.getValue();
            dice.roll();
            int roll2 = dice.getValue();

            if (roll1 != 1 && roll2 != 1) {
                int gainedScore = roll1 + roll2;
                player.updateScore(gainedScore);
            }
            else if (roll1 == 1 && roll2 == 1) {
                player.updateScore(-1);
            }

            displayPlayerTurn(player, roll1, roll2);
        }
    }

    public void displayPlayerTurn(Player player, int roll1, int roll2) {
        System.out.println(player.getName() + " has " + player.getScore() + " points after rolling " + roll1 + " and " + roll2);
    }
}
