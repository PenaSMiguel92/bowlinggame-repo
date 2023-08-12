public class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int value = 0;
        int p1_score = 0;
        int p2_score = 0;
        for (int index = 0; index < player1.length; index++) {
            p1_score += calculateScore(player1, index);
            p2_score += calculateScore(player2, index);
        }
        return value;
    }

    public int calculateScore(int[] player, int currentIndex) {
        if (currentIndex - 1 < 0 || currentIndex - 2 < 0)
            return player[currentIndex];
        return (player[currentIndex - 1] == 10 || player[currentIndex - 2] == 10) ? 2 * player[currentIndex]
                : player[currentIndex];
    }
}
