class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
    //   int n=nums1.length;
    //    int ans[]=new int[n];
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if(nums1[i]==nums2[j]){
    //                 ans=nums1;
    //             }
    //         }
    //     }
    //     return ans;
    HashSet<Integer>s=new HashSet<>();
   
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                s.add(nums1[i]);
            }
        }
    }
    int[] ans = new int[s.size()];
int k = 0;

for (int x : s) {
    ans[k] = x;
    k++;
}
return ans;
    }
}