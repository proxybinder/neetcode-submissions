class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        int prefix = 1;
        for(int i=0; i<nums.length; i++){
            res[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for(int j=nums.length - 1; j>=0; j--){
            res[j] *= postfix;
            postfix *= nums[j];
        }
        return res;
    }
}  
