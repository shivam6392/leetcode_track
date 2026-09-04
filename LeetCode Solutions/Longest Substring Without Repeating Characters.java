class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> sh = new HashMap<>();
        int left = 0;
        int maxcount = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sh.containsKey(ch)){
                left = Math.max(left, sh.get(ch) + 1);
            }
            sh.put(ch, i);
            maxcount = Math.max(maxcount, i - left + 1);
        }
        return maxcount;
    }
}