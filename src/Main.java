public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Player player1 = new Player("a");
        Player player2 = new Player("b");
        Player player3 = new Player("c");
        Player player4 = new Player("d");
        Player player5 = new Player("e");
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
        game.addPlayer(player5);

        while (!game.gameOver()) {
            game.playRound();
            System.out.println();
        }
    }
}