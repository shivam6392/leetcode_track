class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int lmax = nums[0];
        int def = 0;
        int rmin = nums[nums.length - 1];
        for(int i = 0; i < nums.length-1; i++){
            lmax = Math.max(nums[i], lmax);
            for(int j =i+1; j < nums.length; j++){
                rmin = Math.min(rmin ,nums[j]);
            }
            def = lmax - rmin;
            if(def <= k){
                return i;
            }
            rmin = nums[i + 1]; 
        }
        lmax = Math.max(lmax, nums[nums.length - 1]);
        if(lmax - nums[nums.length - 1] <= k){
            return nums.length - 1;
        }
        return -1;
    }
}