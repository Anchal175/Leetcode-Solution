class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        back(nums,0,new ArrayList<>());
        return res;
    }

        public void back(int []nums,int index,List<Integer>temp){

  if(index==nums.length){
        res.add(new ArrayList<>(temp));
        return;
    }
    temp.add(nums[index]);
    back(nums,index+1,temp);
    temp.remove(temp.size()-1);

    //undo krega means exclude krrega jb [1,2,3] subset aa jyemge tb
    back(nums,index+1,temp);
        }

        
    }
