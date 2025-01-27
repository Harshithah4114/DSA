class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = nums[0];
        for(int i : nums){
            if(!hm.containsKey(i)) hm.put(i,1);
            else ans = i;
        }
        return ans;
    }
}
