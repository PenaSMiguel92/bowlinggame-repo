public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] player1_game1 = new int[] { 4, 10, 7, 9 };
        int[] player2_game1 = new int[] { 6, 5, 2, 3 };

        int[] player1_game2 = new int[] { 3, 5, 7, 6 };
        int[] player2_game2 = new int[] { 8, 10, 10, 2 };

        int[] player1_game3 = new int[] { 2, 3 };
        int[] player2_game3 = new int[] { 4, 1 };

        int[] player1_game1193 = new int[] { 10, 2, 2, 3 };
        int[] player2_game1193 = new int[] { 3, 8, 4, 5 };

        System.out.println(sol.isWinner(player1_game1, player2_game1));
        System.out.println(sol.isWinner(player1_game2, player2_game2));
        System.out.println(sol.isWinner(player1_game3, player2_game3));
        System.out.println(sol.isWinner(player1_game1193, player2_game1193));
    }
}