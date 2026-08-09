class Solution {
    public int findNumbers(int[] nums) {
        int digits = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            int count = 0; 
            ans = nums[i];
            while(ans != 0) {
                ans /= 10;
                count ++;
            }
            if(count % 2 == 0) {
                digits++;
            }
        }
        return digits;
    }
}