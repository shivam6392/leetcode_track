class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int dp = discounts.length - 1;
        int mp = prices.length -1;
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
            if(dp >= 0){
                sum +=((prices[mp]*(100- discounts[dp]))/100.0);
                mp--;
                dp--;
            }else{
                sum +=(prices[mp]);
                mp--;
            }
            
        }
        return sum;
    }
}