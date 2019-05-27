public class Runner {

    public static void main(String[] args) {
        Judge judge = new Judge();
        System.out.println("\nPlayer One turn ");
        Player firstPlayer = PlayerBuilder.createPlayer();
        System.out.println("\nPlayer Two turn ");
        Player secondPlayer = PlayerBuilder.createPlayer();
        String result = judge.applyRulesToDecideWinner(firstPlayer, secondPlayer);
        System.out.println(result);
    }
}
