class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length+1];
        for(int i : nums){
            if(!visited[i-1]){
                visited[i-1]=true;
            }
            else{
                return i;
            }
        }
        return -1;
    }
}