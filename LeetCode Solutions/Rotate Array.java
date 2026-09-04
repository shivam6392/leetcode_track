class Solution {
    public void rotate(int[] nums, int k) {
        k =  k % nums.length ; 
        int arr[] = new int[nums.length];
        int sum = nums.length - k -1;
        int sum_c = sum;
        int n = nums.length - 1;
        while(sum >= 0){
            arr[n] = nums[sum];
            sum--;
            n--;
        }
        int i = 0;
        sum_c += 1;
        while(sum_c < nums.length){
            arr[i] = nums[sum_c];
            i++;
            sum_c++; 
        }
        for(int j = 0; j < nums.length; j++){
            nums[j] = arr[j];
        }
    }
}