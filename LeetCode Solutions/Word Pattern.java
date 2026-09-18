class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<String, Character> sh = new HashMap<>();
        HashMap<Character, String> rev = new HashMap<>();
        if(pattern.length() != words.length) return false;
        for(int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            if(sh.containsKey(words[i])) {
                if(sh.get(words[i]) != ch) return false;
            }
            if(rev.containsKey(ch)) {
                if(!rev.get(ch).equals(words[i])) return false;
            }
            sh.put(words[i], ch);
            rev.put(ch, words[i]);
        }
        return true;
    }
}