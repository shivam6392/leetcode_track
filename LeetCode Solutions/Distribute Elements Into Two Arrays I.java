class Solution {
    public int[] resultArray(int[] nums) {
        int arr[] = new int[nums.length];
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int s1 = 0;
        int s2 = 0;
        arr1[s1] = nums[0];
        arr2[s2] = nums[1];
        for(int i = 2; i < nums.length ; i++){
            int sub1 = nums[i] - arr1[s1];
            int sub2 = nums[i] - arr2[s2];
            if(sub1> sub2){
                s2++;
                arr2[s2] =nums[i];
            }else{
                s1++;
                arr1[s1] = nums[i];
            }
        }
        int count = 0;
        for(int i = 0; i <= s1; i++){
            arr[i] = arr1[i];
            count++;
        }
        for(int i = 0; i <= s2; i++){
            arr[count] = arr2[i];
            count++;
        }
        return arr;
    }
}