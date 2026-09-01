class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(num == nums2[j]){
                    nums1[i] = -1;
                    for(int k = j + 1; k < nums2.length; k++){
                        if(nums2[k] > num){
                            nums1[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return nums1;
    }
}