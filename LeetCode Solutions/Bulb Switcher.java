// class Solution {
//     public int bulbSwitch(int n) {
//         if(n == 0) return 0;
//         boolean arr[] = new boolean[n];
//         for(int i = 0; i <n; i++){
//           if(i == 0){
//             for(int l = 0; l < arr.length; l++){
//                 arr[l] = true;
//             }
//           }else if (i == 2){
//             for(int j = 0; j < arr.length ;j++){
//                 if(j % i == 0){
//                     arr[j] = false;
//                 }
//             }
//           }else{
//             for(int k = 0; k < arr.length ;k++){
//                 if(k % i == 0){
//                     if(arr[k] == false){
//                         arr[k] = true;
//                     }else{
//                         arr[k] = false;
//                     }
//                 }
//             }
//           }
//         }
//         if(arr[arr.length - 1] == true) arr[arr.length - 1] = false;
//         if(arr[arr.length - 1] == false) arr[arr.length - 1] = true;
//         int count = 0;
//         for(int i = 0; i < arr.length ;i++){
//             if(arr[i] == true){
//                 count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}