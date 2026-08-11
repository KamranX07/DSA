class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int n = 0;
        int left = 0;
        while(n != nums.length) {
            total += nums[n];
            n++;
        }
        for(int i=0; i<nums.length; i++) {
            int right = 0;
            left += nums[i];
            right = total + nums[i] - left; 
            if(left == right) {
                return i;
            }          
        }        
        return -1;
    }
}