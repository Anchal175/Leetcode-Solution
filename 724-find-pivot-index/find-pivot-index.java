class Solution {
    public int pivotIndex(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     int left=0;
        //     int right=0;
        //     for(int l=0;l<i;l++){
        //         left+=nums[l];
        //     }
        //     for(int r=i+1;r<nums.length;r++){
        //         right+=nums[r];
        //     }
        //     if(left==right){
        //         return i;
        //     }
        // }
        // return -1;

int left=0;
int totalsum=0;
for(int i=0;i<nums.length;i++){
    totalsum+=nums[i];
}

for(int i=0;i<nums.length;i++){
int right=totalsum-left-nums[i];

if(left==right){
    return i;
}
else{
    left+=nums[i];
}
    }
    return -1;
    }
}