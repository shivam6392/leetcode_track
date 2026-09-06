class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ot = nums.length / 3;
        HashMap<Integer, Integer> ph = new HashMap<>();
        List <Integer> sh = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(ph.containsKey(nums[i])){
                ph.put(nums[i], ph.get(nums[i])+1);
            }else{
                ph.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : ph.entrySet()){
            if(entry.getValue() > ot){
                sh.add(entry.getKey());
            }
        }
        return sh;
    }
}