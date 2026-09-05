class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        if(batteryPercentages.length == 0) return 0;
        if(batteryPercentages.length == 1){
            if(batteryPercentages[0]> 0) return 1;
            else{
                return 0;
            }
        }
        for(int i = 0; i < batteryPercentages.length -1; i++){
            if(batteryPercentages[i] > 0){
                count++;
                for(int j = i+1; j <batteryPercentages.length; j++){
                    batteryPercentages[j] = batteryPercentages[j] -1; 
                }
            }
        }
        if(batteryPercentages[batteryPercentages.length - 1]> 0)count++;
        return count;
    }
}