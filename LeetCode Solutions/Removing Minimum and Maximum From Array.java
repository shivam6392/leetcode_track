class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int mini = nums[0];
        int maxi = nums[0];
        int count1 = 1;
        int count2 = n;
        int count3 = 1;
        int count4 = n;
        for (int i = 1; i < n; i++) {
            if (nums[i] > maxi) {
                maxi = nums[i];
                count1 = i + 1;
                count2 = n - i;
            }
            if (nums[i] < mini) {
                mini = nums[i];
                count3 = i + 1;
                count4 = n - i;
            }
        }
        int bothleft = Math.max(count1, count3);
        int bothright = Math.max(count2, count4);
        int leftright = count1 + count4;
        int rightleft = count2 + count3;
        return Math.min(
            Math.min(bothleft, bothright),
            Math.min(leftright, rightleft)
        );
    }
}