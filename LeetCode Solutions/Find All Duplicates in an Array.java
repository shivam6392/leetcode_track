class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> sh = new ArrayList<>();
        HashMap<Integer, Integer> shh = new HashMap <Integer,Integer>();
        for(int i = 0;  i< nums.length; i++){
            if(shh.containsKey(nums[i])){
                sh.add(nums[i]);
            }else{
                shh.put(nums[i], 1);
            }
        }
        return sh;
    }
}