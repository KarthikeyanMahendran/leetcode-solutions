// Bfs Traversal Of Graph [Medium]
// https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Queue <Integer> q = new LinkedList<>();
        
        visited[0]= true;
        q.add(0);
        while (!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for( int n : adj.get(node)){
                if(!visited[n]){
                visited[n]= true;
                q.add(n);
                
                
            }
            }
        }
        
        
        
        
    
    return ans;
    
}}