class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int count = 0;
        int  cop = x;
        // to count number of deg...
        while (cop >0){//   121 121/10 =12 /10 = 1/10 0
            cop = cop/10;
            count++; //5
        }
        int arr[] = new int[count]; // 12121 = [1][2][1][2][1] 5/2 = 2
        int n = arr.length-1;       // 121121 = [1][2][1][1][2][1] 6/2= 3
        // array mai input...       //           i              j
        while(x>0){        
            int deg = x%10;
            arr[n] = deg;
            x = x/10; 
            n--;
        }
        int j = arr.length -1;
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i]!=arr[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}