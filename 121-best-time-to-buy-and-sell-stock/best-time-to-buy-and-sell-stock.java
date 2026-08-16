
        class Solution {
    public int maxProfit(int[] nums) {
        int profit =0;
        int min = nums[0];
        for(int i =1;i< nums.length;i++){
            min = Math.min(min,nums[i]);
            if (nums[i]>nums[i-1]){
                profit = Math.max(profit,nums[i]-min);
            }
        }
        return profit;
    }
}