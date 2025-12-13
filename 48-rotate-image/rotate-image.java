class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;      //step 1 :me transpose the matrix
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j]; // swap the row to column
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        }
        for(int i=0;i<n;i++){        // step 2:reverse each row 
            int left=0;
            int right=n-1;
            while(left<right){      //reverse code
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }                              
        }
    }
}