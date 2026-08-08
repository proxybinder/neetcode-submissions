class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mainSet = new HashSet<>();
        for(int n : nums){
            mainSet.add(n);
        }
        int result = 0;
        for(int i : mainSet){
            if(!mainSet.contains(i-1)){
                int length=0;
                while(mainSet.contains(i+length)){
                    length++;
                }
                result=Math.max(length, result);
            }
        }
        return result;
    }
}