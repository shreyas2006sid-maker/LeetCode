class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int t=0;
        int leftmax=0;
        int rightmax=0;
        int l=0;
        int r=n-1;
        while(l<r){
            leftmax=Math.max(leftmax,height[l]);
            rightmax=Math.max(rightmax,height[r]);
            if(leftmax<rightmax){
                t+=leftmax-height[l];
                l++;
            }
            else{
                t+=rightmax-height[r];
                r--;
            }
        }
        return t;
    }
}