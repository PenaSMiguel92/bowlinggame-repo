public class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1_score = 0;
        int p2_score = 0;
        for (int index = 0; index < player1.length; index++) {
            p1_score += calculateScore(player1, index);
            p2_score += calculateScore(player2, index);
        }
        if (p1_score > p2_score)
            return 1;
        if (p2_score > p1_score)
            return 2;
        
        return 0;
    }

    public int calculateScore(int[] player, int currentIndex) {
        if (currentIndex - 1 < 0) return player[currentIndex];
        if (currentIndex - 2 < 0)
            return (player[currentIndex - 1] == 10) ? 2 * player[currentIndex] : player[currentIndex];
        
        return (player[currentIndex - 1] == 10 || player[currentIndex - 2] == 10) ? 2 * player[currentIndex]
                : player[currentIndex];
    }
}
