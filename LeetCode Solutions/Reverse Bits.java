class Solution {
    public int reverseBits(int n) {
        int val = 0;
        for(int i = 0; i < 32; i++){
            int bit = 1;
            if((n & 1)== 0) {
                bit = 0;
            }
            val = (val << 1) | bit;
            n = n >> 1;
        }
        return val;
    }
}