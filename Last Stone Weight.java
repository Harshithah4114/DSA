class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue <Integer> pq = new PriorityQueue <>(Collections.reverseOrder());

        for(int i : stones){
            pq.add(i);
        }

        while(pq.size() > 1){
            int max = pq.poll();
            int min = pq.poll();
            if(min != max) pq.add(max - min);
        }

        return (pq.size() == 0)? 0:pq.peek();
        
        

    }
}
