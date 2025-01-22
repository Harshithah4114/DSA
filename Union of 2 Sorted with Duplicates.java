class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(int i : a){
            ts.add(i);
        }
        
        for(int i : b){
            ts.add(i);
        }
        
        for(int i : ts){
            al.add(i);
        }
        
        return al;
    }
}
