class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minarr = new int[n];
        minarr[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            minarr[i] = Math.min(nums[i], minarr[i + 1]);
        }
        int lmax = nums[0];
        for(int i = 0; i < n; i++){
            lmax = Math.max(lmax, nums[i]);
            int rmin = minarr[i];
            if(lmax - rmin <= k){
                return i;
            }
        }
        return -1;
    }
}