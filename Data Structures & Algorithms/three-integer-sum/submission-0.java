class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i< nums.length - 1; i++){
            int a = nums[i];

            if(i > 0 && a == nums[i - 1]){
                continue;
            }

            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int threeSum = a + nums[left] + nums[right];

                if(threeSum < 0){
                    left++;
                } else if(threeSum > 0){
                    right--;
                } else{
                    res.add(Arrays.asList(a, nums[left], nums[right]));
                    left++;
                    while(nums[left] == nums[left - 1] && left < right){
                        left++;
                    }
                }
            }
        }
        return res;        
    }
}