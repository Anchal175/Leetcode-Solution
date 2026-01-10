// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//      StringBuilder mag=new StringBuilder(magazine);
//      StringBuilder ran=new StringBuilder(ransomNote);
//      for(int i=0;i<ran.length();i++){
//         boolean found=false;
// for(int j=0;j<mag.length();j++){
//     if(ran.charAt(i)==(mag.charAt(j))){
//      mag.deleteCharAt(j);   // letter use ho gaya
//                     found = true;
//                     break;
//     }
// }
//      }
//      return false;

//     }
// }
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        StringBuilder mag = new StringBuilder(magazine);

        for (int i = 0; i < ransomNote.length(); i++) {
            boolean found = false;

            for (int j = 0; j < mag.length(); j++) {

                if (ransomNote.charAt(i) == mag.charAt(j)) {
                    mag.deleteCharAt(j);   // letter use ho gaya
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
