public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        Player player1 = new Player("ghodfh");
        Player player2 = new Player("asfda");
        Player player3 = new Player("fgsa");
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.playRound();
    }
}