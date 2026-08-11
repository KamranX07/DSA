class Solution {
    public int pivotIndex(int[] nums) {
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0; i<nums.length; i++) {
            temp1 += nums[i];
            temp2 = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                temp2 += nums[j];
            }
            if(temp1 == temp2) {
                return i;
            }          
        }        
        return -1;
    }
}