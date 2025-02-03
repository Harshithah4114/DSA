class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;

        int inc_len = 1, dec_len = 1, max = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){ 
                inc_len++;
                dec_len = 1;
            }
            else if (nums[i] < nums[i-1]){
                dec_len++;
                inc_len = 1;
            } 
            else{
                inc_len = 1;
                dec_len = 1;
            }
            
            max = Math.max(max, Math.max(inc_len, dec_len)); 

        }
        return max;
    }
}
