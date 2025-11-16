class Solution {
    public void back(int []arr,int tar,int i,ArrayList<Integer>temp,List<List<Integer>> al){
        if(tar==0){
            al.add(new ArrayList<>(temp));
            return;
        }
        
        for(int j=i;j<arr.length;j++){
            if(arr[j]>tar){
                continue;
            }
            temp.add(arr[j]);
            back(arr,tar-arr[j],j,temp,al);
            temp.remove(temp.size()-1);
        }
        }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>al=new ArrayList<>();
        back(candidates,target,0,new ArrayList<>(),al);
        return al;
    }
}