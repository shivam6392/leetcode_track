class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sh = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sh.put(nums[i], i);
        }
        int ans[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(sh.containsKey(rem) && sh.get(rem) != i){
                ans[0] = i;
                ans[1] = sh.get(rem);
                return ans;
            }
        }
        return ans;
    }
}