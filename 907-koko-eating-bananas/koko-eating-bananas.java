class Solution {
    public int minEatingSpeed(int[] piles, int h) {

       int l=1;
       int r=0;
       for(int p:piles){
        r=Math.max(r,p);
       }
       int ans=Integer.MIN_VALUE;
       while(l<=r){
        int m=l+(r-l)/2;
        long hours=0;
        for(int p:piles){
            hours+=(p+m-1)/m;
        }
        if(hours<=h){
            ans=m;
            r=m-1;
        }
        else{
            l=m+1;
        }
       }
       return ans;
    }

}