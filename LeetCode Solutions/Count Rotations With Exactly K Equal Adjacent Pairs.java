class Solution {
    public int countRotations(String s, int k) {
        int count = 0;
        int n= s.length();
        for(int i = 0; i < n; i++){
            String ss = s.substring(i) + s.substring(0,i);
            int sc = 0;
            for(int j = 0; j<n-1; j++){
                if(ss.charAt(j) == ss.charAt(j+1)){
                    sc++;
                }
            }
            if(sc ==k){
                count++;
            }
        }
        return count;
    }
}