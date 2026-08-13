class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int res = 0;
        int l = 0;
        int maxf = 0;
        for(int r=0; r < s.length(); r++){
            char rChar = s.charAt(r);
            count.put(rChar, 1 + count.getOrDefault(rChar, 0));
            maxf = Math.max(maxf, count.get(rChar));
            while((r - l + 1) - maxf > k){
                char lChar = s.charAt(l);
                count.put(lChar, count.get(lChar) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
