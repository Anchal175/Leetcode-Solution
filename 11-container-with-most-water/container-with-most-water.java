class Solution {
    public int maxArea(int[] height) {
       //area=min(ri8,left) *(left-right)
       //hme sbse max pole choose krna jisme pani jada ho 
       //or usko multiply
       int left=0;
       int right=height.length-1;
       int maxm=0;
       while(left<right){
        
            int area=Math.min(height[left],height[right])*(right-left);
        
        maxm=Math.max(maxm,area);
       
        if(height[left]<height[right]){
            left++; 
    }
    else{
        right--;
    }
       }
    return maxm;
    }
}