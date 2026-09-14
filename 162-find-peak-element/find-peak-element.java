class Solution {
    public int findPeakElement(int[] nums) {
        // int largest = Integer.MIN_VALUE;
        // int index = 0;

        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] > largest) {
        //         largest = nums[i];
        //         index = i;
        //     }
        // }

        // return index;
        int l=0;
        int r=nums.length-1;
      
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid+1]){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}