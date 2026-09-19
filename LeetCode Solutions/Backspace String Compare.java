class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuffer sh = new StringBuffer();
        StringBuffer ph = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);;
            if((ch == '#') && (sh.length()== 0)){
            }
            if((ch == '#') && (sh.length()> 0)){
                sh.deleteCharAt(sh.length() - 1);
            }else if(ch != '#'){
                sh.append(ch);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char cch = t.charAt(i);
            if((cch == '#') && (ph.length()== 0)){
            }
            if((cch == '#')&& (ph.length()> 0)){
                ph.deleteCharAt(ph.length() - 1);
            }else if(cch != '#'){
                ph.append(cch);
            }
        }
        if(sh.toString().equals(ph.toString())) return true;
        return false;
    }
}