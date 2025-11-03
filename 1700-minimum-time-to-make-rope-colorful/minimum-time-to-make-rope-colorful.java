class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0, maxi = neededTime[0], sum = neededTime[0];
        for(int i = 1; i < colors.length(); i++)
        {
            if(colors.charAt(i) == colors.charAt(i - 1))
            {
                sum += neededTime[i];
                maxi = Math.max(maxi, neededTime[i]);
            }else{
                ans += sum - maxi;
                sum = neededTime[i];
                maxi = neededTime[i];
            }
        }
        ans += sum - maxi;
        return ans;
    }
}