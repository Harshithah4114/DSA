class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList <>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
                // we can also use this condition for i instead of if condition above
                // while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
            }
        }
        return ans;
    }
}
