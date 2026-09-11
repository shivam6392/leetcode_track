class Solution {
    public int totalNumbers(int[] digits) {
        HashMap<Integer, Integer> sh = new HashMap<>();
        for(int digit : digits){
            sh.put(digit, sh.getOrDefault(digit, 0) + 1);
        }
        int ans = 0;
        for(int num = 100; num <= 999; num++){
            if(num % 2 == 0){
                int a = num / 100;
                int b = (num / 10) % 10;
                int c = num % 10;
                HashMap<Integer, Integer> temp = new HashMap<>(sh);
                if(temp.getOrDefault(a, 0) > 0){
                    temp.put(a, temp.get(a) - 1);
                    if(temp.getOrDefault(b, 0) > 0){
                        temp.put(b, temp.get(b) - 1);
                        if(temp.getOrDefault(c, 0) > 0){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}