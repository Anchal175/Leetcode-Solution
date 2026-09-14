// // class Solution {
// //     public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
// //         int ans[]=new int[rec1.length];
// //         for(int i=0;i<rec1.length;i++){
// //             ans[i]=rec1[i]+1;
// //         }
// //         for(int i=0;i<rec2.length;i++){
// //         if(ans[i]==rec2[i]){
// //             return true ;

// //         }}
// //         return false;
// //     }
// // }
// class Solution {
//     public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

//         int[] ans = new int[rec1.length];

//         for (int i = 0; i < rec1.length; i++) {
//             ans[i] = rec1[i] + 1;
//         }

//         for (int i = 0; i < rec2.length; i++) {
//             if (ans[i] != rec2[i]) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        if (rec1[0] < rec2[2] &&
            rec2[0] < rec1[2] &&
            rec1[1] < rec2[3] &&
            rec2[1] < rec1[3]) {
            
            return true;
        }

        return false;
    }
}