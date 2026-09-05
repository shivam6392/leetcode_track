class Solution {
    public int countBalls(int lowLimit, int highLimit) {
      HashMap<Integer, Integer> sh = new HashMap<>();
      for(int i = lowLimit; i <= highLimit; i++ ){
        int val = i;
        int sum = 0;
        while(val != 0){
            int num = val % 10;
            sum += num;
            val = val /10;
        }
        if(sh.containsKey(sum)){
            sh.put(sum, sh.get(sum)+1);
        }else{
            sh.put(sum, 1);
        }
      }
      int max = 0;
      for(Integer value : sh.values()){
            max = Math.max(max, value);
        } 
      return max;
    }
}