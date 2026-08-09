class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int temp = 0;
        for(int i=0; i<accounts.length; i++) {
            for(int j=0; j<accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            wealth[i] = temp;
            temp = 0;
        }
        int max = wealth[0];
        for(int i=0; i<wealth.length; i++) {
            if(wealth[i] > max) {
                max = wealth[i];
            }
        }
        return max;
    }
}