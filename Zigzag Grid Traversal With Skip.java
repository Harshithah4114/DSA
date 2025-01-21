class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        ArrayList<Integer> al = new ArrayList<>();
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++){
            if(i % 2 == 0){
                for(int j = 0; j < col; j++){
                    if((i+j) % 2 == 0){
                        al.add(grid[i][j]);
                    }
                }
            }
            else{
                for(int j = col-1; j >= 0; j--){
                    if((i+j) % 2 == 0){
                        al.add(grid[i][j]);
                    }
                }
            }
        }
        return al;
    }
}
