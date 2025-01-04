class Solution {
    class Node{
        HashMap <Character, Node> child;
        boolean isEnd;
        public Node(){
            child = new HashMap<>();
            isEnd = false;
        }
    }
    private Node root;
    public List<String> findWords(char[][] board, String[] words) {
        root = new Node();
        for(String s : words){
            insert(s);
        }
        int n = board.length;
        int m = board[0].length;
        HashSet <String> ans = new HashSet<>();
        // traversing the board
        for(int i = 0; i<n; i++){
            for(int j = 0; j <m; j++){
                char ch = board[i][j];
                if(root.child.containsKey(ch)){
                    // restarts the visited each time
                    // prevents from going back to 'o'(0,0) when it is in 'a'(0,1)
                    boolean [][]vis = new boolean[n][m];
                    dfs(board, i , j, ans, "", vis, root);
                }
            }
        }
        return new ArrayList<>(ans);
    }

    void dfs(char[][]board, int r, int c, HashSet<String> ans, String asf,boolean [][] vis, Node root){
       int n = board.length;
       int m = board[0].length;

       //base condition
       // if it goes out of the board
        if(r < 0 || r >= n || c < 0 || c >= m || vis[r][c]){
            return;
        }

        char ch = board[r][c];

        if(!root.child.containsKey(ch)){
            return;
        }

        vis[r][c] = true;
        root = root.child.get(ch);
        asf += ch;

        // if the current node marks the end of a word add it to the result set
        if(root.isEnd){
            ans.add(asf);
        }

        //explore the neighbours
        dfs(board, r - 1, c, ans, asf, vis, root); //up
        dfs(board, r + 1, c, ans, asf, vis, root); // down
        dfs(board, r , c - 1, ans, asf, vis, root); // left
        dfs(board, r, c + 1, ans, asf, vis, root); // right

        vis[r][c] = false; // backtracking
    }
    void insert(String word){
        Node temp = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(temp.child.containsKey(ch)){
                temp = temp.child.get(ch);
            }
            else{
                Node nn = new Node();
                temp.child.put(ch,nn);
                temp = nn;
            }
        }
        temp.isEnd = true;
    }
}
