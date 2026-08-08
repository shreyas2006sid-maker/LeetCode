class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int l=matrix[0].length;

        int start=0;
        int end=r*l-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            int row=mid/l;
            int col=mid%l;
            int val=matrix[row][col];

            if(val==target){
                return true;
            }
            else if(val<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
        
    }
}