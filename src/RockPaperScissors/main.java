public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Luca", "rock");
        Player player2 = new Player("Jano", "scissors");

        String result = Match.match(player1, player2);

        System.out.println(result);
    }
}
