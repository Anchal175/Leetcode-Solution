class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=0;i<n;i++){
           sumodd+=(2*i)+1;
           sumeven+=(2*i);
        }
          while (sumodd != 0) {
            int temp = sumodd;
            sumodd = sumeven % sumodd;
            sumeven = temp;
        }

        return sumeven;
    }
}