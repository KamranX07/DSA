class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a = 1;
        int b = n;
        int[] res = new int[2*n];
        res[0] = nums[0];
        res[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length-2; i+=2) {
            res[i] = nums[b];
            res[i+1] = nums[a];
            b++;
            a++;
        }
        return res;
    }
}