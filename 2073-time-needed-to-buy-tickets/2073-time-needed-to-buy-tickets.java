class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeTaken = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                
                timeTaken += Math.min(tickets[i], tickets[k]);
            } else {
                
                timeTaken += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return timeTaken;
    }
}
