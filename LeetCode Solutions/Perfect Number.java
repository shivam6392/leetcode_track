class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <num;i++){
            if(num % i == 0){
                arr.add(i);
            }
        }
        int dum  = 0;
        for(int i = 0;i < arr.size(); i++){
            dum += arr.get(i);
        }
        if(dum == num) return true;
        return false;
    }
}