class Solution {
    public int clumsy(int n) {
        int ans = 0;
        int temp = n;
        int step = 1;
        n--;
        while(n > 0){
            if(step == 1){
                temp *= n;
            }
            else if(step == 2){
                temp /= n;
            }
            else if(step == 3){
                ans += temp;
                ans += n;
                temp = 0;
            }
            else if(step == 4){
                temp = -n;
                step = 0;
            }
            step++;
            n--;
        }
        ans += temp;
        return ans;
    }
}