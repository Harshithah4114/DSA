class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int currcount = 0;
        for(int i : nums){
            if(i == 1){
                currcount++;
                count = Math.max(count, currcount);
            }
            else{
                
                currcount = 0;
            } 
        }
        return count;
    }
}
