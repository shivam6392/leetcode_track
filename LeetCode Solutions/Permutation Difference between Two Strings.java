class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> sh = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sh.put(s.charAt(i), i);
        }
        int sum = 0;
        for(int i = 0; i < t.length(); i++){
            int ind1 = sh.get(t.charAt(i));
            int ind2 = i;
            sum += Math.abs(ind1 - ind2);
        }
        return sum;
    }
}