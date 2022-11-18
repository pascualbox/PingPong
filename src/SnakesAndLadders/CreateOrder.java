import java.util.Arrays;

public class CreateOrder {
    public static Game[] createOrder(Game[] players) {
        for (Game player : players) {
            int diceRoll = player.diceRoll();
            player.setDiceRoll(diceRoll);
        }
        Arrays.sort(players);
        return players;
    }
}