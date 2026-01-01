class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         m=nums1.length;
//         n=nums2.length;
//         int i=0;int j=0;int k=0;
//         int arr[]=new int [n+m];
//         while(n>0 && m>0){
//             if(nums1[i]<nums2[j]){
//                 arr[k]=nums1[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 arr[k]=nums2[j];
//                 j++;k++;
//             }
//         }
//             while(i<n){
//                 arr[k]=nums1[i];
//                 i++;k++;

//             }
//             while(j<m){
//                 arr[k]=nums2[j];
//                 j++;
//                 k++;
//             }
        
//         public class MergedArray {
//     public static void main(String[] args) {
//         int[] narray = {10,20,30,40};
//         int[] marray ={20,60,100,120};
//         int[] mnarray = merge(narray,marray);
//         System.out.println(Arrays.toString(mnarray));

// return arr;
         
//     }
// }

            
           // import java.util.Arrays;
// import java.util.Scanner;

// public class MergedArray {
    //public static void main(String[] args) {
        // int[] narray = {10,20,30,40};
        // int[] marray ={20,60,100,120};
    //     int[] mnarray = merge(nums1,nums2);
    //     System.out.println(Arrays.toString(mnarray));
    // }
    // public static int[] merge(int[] nums1,int[] nums2){
    //     int i=0;
    //     int N= nums1.length;
    //     int M = nums2.length;
    //     int j=0;
    //     int k=0;
    //     int[] mnarray = new int[N+M];
    //     while(i<N && j<M){
    //         if(nums1[i]< nums2[j]){
    //             mnarray[k] = nums1[i];
    //             i++;
    //             k++;
    //         }else{
    //             mnarray[k] = nums2[j];
    //             j++;
    //             k++;
    //         }
    //     }
    //     while(i<N){
    //         mnarray[k]=nums1[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<M){
    //         mnarray[k] = nums2[j];
    //         j++;
    //         k++;
    //     }
    //     return mnarray;

    // int i=m-1;
    // int j=n-1;
    // int k=m+n-1;
    // while(j>=0){
    //     if(i>=0 && nums1[i]>nums2[j]){
    //         nums1[k--]=nums1[i--];
    //     }
    //     else{
    //         nums1[k--]=nums2[j--];
    //     }
    // }
int i=m-1;
int j=n-1;
int k=m+n-1;
while(j>=0){
    if(i>=0 && nums1[i]>nums2[j]){
        nums1[k--]=nums1[i--];
    }
     
        else{
            nums1[k--]=nums2[j--];
        }
}

    }
}
   