class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            int value = 0;
            int temp = 0;
            int max = 0;
            value = candies[i] + extraCandies;
            while(temp != candies.length) {
                if(candies[temp] > value) {
                    max = candies[temp];
                }
                temp++;
            }
            if(value > max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}