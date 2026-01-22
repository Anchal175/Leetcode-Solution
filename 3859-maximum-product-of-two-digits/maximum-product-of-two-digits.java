// class Solution {
//     public int maxProduct(int n) {

//     //int --> arry me nhi bdl skte to string use kr skte h
//     String s=String.valueOf(n);
//     int nums[]=new int[s.length()];
//     for(int i=0;i<s.length;i++){
//         nums[i]= s.charAt(i)-'0';
//     }
//     Arrays.sort(nums);
//     int m=nums.length;
//     int k=nums[m-1]*nums[m-2];
//     return k;


//     }

// }


class Solution {
    public int maxProduct(int n) {

        String s = String.valueOf(n);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort(arr);

        int len = arr.length;
        return arr[len - 1] * arr[len - 2];
    }
}
