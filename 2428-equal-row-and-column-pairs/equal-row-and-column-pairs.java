class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        Map<String,Integer> rowMap=new HashMap<>();
        int count=0;
        for(int row[]:grid)
        {
            String rowStr =Arrays.toString(row);
            rowMap.put(rowStr,rowMap.getOrDefault(rowStr,0)+1);
        }
        int col[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                col[j]=grid[j][i];
            }
            String colStr=Arrays.toString(col);
            if(rowMap.containsKey(colStr))
            count+=rowMap.get(colStr);
        }
        return count;
    }

}