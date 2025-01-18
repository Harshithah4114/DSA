class Solution {
    public int halveArray(int[] nums) {

        PriorityQueue <Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;

        for(double i : nums){
            pq.add(i);
            sum+=i;
        }

        double half = sum/2;

        int count = 0;

        while(half < sum && pq.size() > 0){
            double ele = pq.poll();
            sum = sum - (ele/2);
            pq.add(ele/2);
            count++;
        }

        return count;
        
        

    }
}
