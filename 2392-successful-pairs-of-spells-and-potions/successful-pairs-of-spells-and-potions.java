// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         Arrays.sort(spells);
//         int  n=potions.length;
//         int ans[]=new int[spells.length];
//         for(int i=0;i<spells.length;i++){
//             int spell=spells[i];
//             int low=0,high=n-1;
//             int idx=n;
//             while(low<=high){
//                 int mid=low+(high-low)/2;
//                 if((long) spell*potions[mid]>=success){
//                     idx=mid;
//                     high=mid-1;

//                 }
//                 else{
//                     low=mid+1;
//                 }
//             }
//             ans[i]=n-idx;
//         }
//         return ans;

//     }
// }
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);                 // 1️⃣ potions sort
        int n = potions.length;
        int[] ans = new int[spells.length];   // result array

        for (int i = 0; i < spells.length; i++) {

            int spell = spells[i];
            int low = 0, high = n - 1;
            int idx = n;   // default: no valid potion

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if ((long) spell * potions[mid] >= success) {
                    idx = mid;          // possible answer
                    high = mid - 1;     // aur left search
                } else {
                    low = mid + 1;
                }
            }

            ans[i] = n - idx;   // total valid potions
        }

        return ans;
    }
}
