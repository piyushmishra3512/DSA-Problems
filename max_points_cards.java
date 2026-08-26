/*Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.

Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row.

The score is the sum of the scores of the chosen cards.

 */
public class max_points_cards {
    public int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;
        int sum = 0 ;
        for(int  i = 0 ; i<=k-1;i++){
            sum+=cardScore[i];
        }
        int maxsum = sum;
        int curr = sum;
        int rightIndex= cardScore.length-1;
        for(int i = k-1 ; i>=0;i--){
            curr-=cardScore[i];
            curr+=cardScore[rightIndex];
            maxsum = Math.max(curr,maxsum);
            rightIndex--;
        }
        return maxsum;
        //your code goes here
    }

    
}
