class Solution {
    public int minOperations(int[] nums, int k) {

        PriorityQueue <Long> pq = new PriorityQueue <>();

        int count = 0;

        for(long i : nums){
            pq.add(i);
        }


        while(pq.peek() < k){
            long min = pq.poll();
            long max = pq.poll();
            
            pq.add(min * 2 + max);
            count++;
        }

        return count;
        

    }
}
