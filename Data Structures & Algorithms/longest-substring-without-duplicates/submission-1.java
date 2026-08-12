class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] set = new int[128];
        int l = 0;
        int result = 0;

        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            l = Math.max(l, set[c]);
            result = Math.max(result, r - l + 1);
            set[c] = r + 1;           
        }
        return result;
    }
}
