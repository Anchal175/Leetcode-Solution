// class Solution {
//    public void back(int []arr,int i,ArrayList<Integer>temp,List<List<Integer>>ans){
//         if(tar==0){
//             ans.add(new ArrayList<>(temp));
//                 return;
            
//             for(int j=i;j<arr.length;i++){
//                 if(arr[j]>tar){
//                     continue;
//                 }
//                 temp.add(arr[j]);
//                 back(arr,tar-arr[j],j,temp,ans);
//                 temp.remove(temp.size()-1);

//             }
//         }
   
//          public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//             List<List<Integer>>ans=new ArrayList<>();
//         back(candidates,target,0,new ArrayList<>(),ans);
//         return ans;
//     }
// }
class Solution {
    public void back(int[] arr, int tar, int i, 
                     ArrayList<Integer> temp, List<List<Integer>> ans) {

        if (tar == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int j = i; j < arr.length; j++) {

            // Skip duplicates
            if (j > i && arr[j] == arr[j - 1]) continue;

            // Stop if number > target
            if (arr[j] > tar) break;

            temp.add(arr[j]);
            back(arr, tar - arr[j], j + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates); // VERY IMPORTANT for duplicates

        List<List<Integer>> ans = new ArrayList<>();
        back(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }
}
