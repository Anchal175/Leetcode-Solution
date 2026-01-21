// class Solution {
//     public int absDifference(int[] nums, int k) {
//         int max=0;
//         int min=0;
//         int sum=0;
//         for(int i=0;i<k;i++){
//           sum+=nums[i];
//         }
//           max=sum;
//           min=sum;

//           int i=0;
//           int j=k;

//           while(k<nums.length){
//             sum-=nums[i];
//             i++;
//             sum+=nums[j];
//             j++;
          
//           max=Math.max(max,sum);
//           min=Math.min(min,sum);
//           }
//           return Math.abs(max-min);
//     }
// }
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int max = 0;
        int min = 0;
        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum;
        min = sum;

        int i = 0;
        int j = k;

        // FIX: condition + j++
        while (j < nums.length) {
            sum -= nums[i];
            i++;

            sum += nums[j];
            j++;

            // FIX: update max & min inside loop
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }

        // FIX: return statement
        return (max - min);
    }
}
