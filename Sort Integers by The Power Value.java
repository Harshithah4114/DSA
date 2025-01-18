class Solution {
    public int getKth(int lo, int hi, int k) {

        class Pair{
            int power;
            int ele;
            public Pair(int p, int e){
                power = p;
                ele = e;
            }
        }

        HashMap <Integer,Integer> hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.power == b.power) {
                return Integer.compare(a.ele, b.ele);
            }
            return Integer.compare(a.power, b.power);
        });


        int count = 0;

        for(int i = lo; i <= hi; i++){
            int x = i;
            count = 0;
            while(x != 1){
                if(x % 2 == 0){
                    x = x / 2;       
                }
                else{
                    x = 3 * x + 1;
                }
                count++;
            }
            pq.add(new Pair(count, i));
            
        }
        
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans = pq.poll().ele;
        }

        return ans;


    }
}
