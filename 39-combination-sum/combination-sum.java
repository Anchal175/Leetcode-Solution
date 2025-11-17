class Solution {
    public void back(int []arr,int tar,int i,ArrayList<Integer>temp){
        if(tar==0){
            al.add(new ArrayList<>(temp));
            return;
        }
        
        for(int j=i;j<arr.length;j++){
            if(arr[j]>tar){
                continue;
            }
            temp.add(arr[j]);
            back(arr,tar-arr[j],j,temp);
            temp.remove(temp.size()-1);
        }
        }
         List<List<Integer>>al=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        back(candidates,target,0,new ArrayList<>());
        return al;
    }
}