class Solution {
    public int lengthOfLongestSubstring(String s) {
//         HashMap<Character,Integer>map=new HashMap<>();
//         int n=s.length();
//        int l=0;
//        int r=0;
//        int maxlen=0;
//        while(r<n) {
// if(map.containsKey(s.charAt(r)))
//     l=Math.max(l,map.get(s.charAt(r))+1);
//     int len=r-l+1;
//     maxlen=Math.max(len,maxlen);
//     map.put(s.charAt(r),r);
//     r++;

//        }
//        return maxlen;
//     }
// }
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         int l=0, r=0, maxLen=0;
//         int n = s.length();
//         while(r<n)
//         {
//             if(map.containsKey(s.charAt(r)))
//             l = Math.max(l,map.get(s.charAt(r))+1);

//             int len = r-l+1;
//             maxLen = Math.max(len,maxLen);
//             map.put(s.charAt(r),r);
//             r++;
//         }
//         return maxLen;
//     }
// }
HashSet<Character>set=new HashSet<>();
int left=0;
int maxlen=0;
for(int right=0;right<s.length();right++){
    while(set.contains(s.charAt(right))){
        set.remove(s.charAt(left));
        left++;
    }
    set.add(s.charAt(right));

maxlen=Math.max(maxlen,right-left+1);
}
return maxlen;
}}