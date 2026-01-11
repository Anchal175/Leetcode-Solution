//class Solution {
//     public void setZeroes(int[][] matrix) {
//         int n,m;
//         int col[m]={0};
//         int row[n]={0};
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==0){
//                     row[i]=1;
//                     col[j]=1;
//                 }
//             }
//         }
//          for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(col[j]||row[i]){
//                     matrix[i][j]=0;
//                 }
//             }
//          }return matrix
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;        // number of rows
        int m = matrix[0].length;     // number of columns

        int[] row = new int[n];       // to track rows that should be zeroed
        int[] col = new int[m];       // to track columns that should be zeroed

        // Step 1: Mark rows and columns that should be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Step 2: Set zeroes in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}
