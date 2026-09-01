class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums.length == 1){
            nums[0] = -1;
            return nums;
        }
        int arr[] = new int[nums.length * 2];
        for(int i = 0; i < nums.length ; i++){
            arr[i] = nums[i];
        }
        int k = nums.length ;
        for(int i = 0; i < nums.length ; i++){
            arr[k] = nums[i];
            k++;
        }

        for(int i = 0; i < nums.length ; i++){
            int count = i+1;
            int j = 0;
            while(j < nums.length){
            if(nums[i]< arr[count]){
                nums[i] = arr[count];
                break;
            }else{
                count++;
                j++;
            }
            if(j == nums.length - 1){
                nums[i] = -1; 
                break;
            }
        }
        }
        return nums;
    }
}