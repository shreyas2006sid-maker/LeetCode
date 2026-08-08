class Solution {
    public int removeDuplicates(int[] arr) {
        int k=2;
        for(int i=2;i<arr.length;i++){
            if(arr[i]!=arr[k-2]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}