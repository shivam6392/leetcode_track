class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int half = (nums.length+1) /2;
        int sarr[] = new int[half];
        int larr[] = new int[nums.length - half];
        for(int i = 0; i < half; i++){
            sarr[i] = nums[i];
        }
        int t = 0;
        for(int i = half; i < nums.length; i++){
            larr[t] = nums[i];
            t++;
        }
        int s = sarr.length -1;
        int l = larr.length -1;
        for(int i = 0; i <nums.length ; i++){
            if(i % 2 != 0){
                nums[i] = larr[l];
                l--;
            }else{
                nums[i] = sarr[s];
                s--;
            }
        }
    }
}