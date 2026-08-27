// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         if(nums1.length == 0|| nums2.length== 0) return nums1;
//         int i = 0;
//         int j = 0;
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         ArrayList<Integer> list = new ArrayList<>();
//         while(i < nums1.length && j < nums2.length){
//             if(nums1[i] == nums2[j]){
//                 list.add(nums1[i]);
//                 i++;
//                 j++;
//             }
//             else if(nums1[i] < nums2[j]){
//                 i++;
//             }else if(nums1[i] > nums2[j]){
//                 j++;
//             }

//         }
//         int[] arr = new int[list.size()];
//         for (int k = 0; k < list.size(); k++) {
//             arr[k] = list.get(k);
//         }

//         Arrays.sort(arr);
//         int l = 0;
//         for (int m = 1; m < arr.length; m++) {
//             if (arr[l] != arr[m]) {
//                 l++;
//                 arr[l] = arr[m];
//             }
//         }
//         int[] ans = new int[l + 1];
//         for (int o = 0; o <= l; o++) {
//             ans[o] = arr[o];
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> sh = new HashMap<Integer, Integer>();
        int arr[] = new int[Math.min(nums1.length, nums2.length)];
        for(int i = 0; i < nums1.length; i++){
            if(sh.containsKey(nums1[i])){
                sh.put(nums1[i], sh.get(nums1[i])+1);
            }else{
                sh.put(nums1[i], 1);
            }
        }
        int pointer = 0;
        for(int i = 0; i < nums2.length; i++){
            if(sh.containsKey(nums2[i]) && sh.get(nums2[i]) != 0 ){
                arr[pointer] = nums2[i];
                pointer++;
                sh.put(nums2[i], 0);
            }
        }
        int ans[] = new int[pointer];
        for(int i = 0; i < ans.length ; i++){
            ans[i] = arr[i];
        }
        return ans;
    }
}