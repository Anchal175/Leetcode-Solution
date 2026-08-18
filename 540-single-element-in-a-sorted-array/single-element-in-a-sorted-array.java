class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                map.remove(nums[i]);
            }
            else{
                map.add(nums[i]);
            }
        }
            for(int x:map){
                return x;
            }
        
        return -1;
    }
}