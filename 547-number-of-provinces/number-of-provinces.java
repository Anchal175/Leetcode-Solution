class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, isConnected, n);
                provinces++; // Found a new province
            }
        }
        return provinces;
    }
    
    private void dfs(int node, boolean[] visited, int[][] isConnected, int n) {
        visited[node] = true;
        for (int i = 0; i < n; i++) {
            if (isConnected[node][i] == 1 && !visited[i]) {
                dfs(i, visited, isConnected, n);
            }
        }
    }
}