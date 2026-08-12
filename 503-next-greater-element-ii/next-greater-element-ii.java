class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] result=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=curr){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    result[i]=-1;
                }
                else{
                    result[i]=stack.peek();
                }
            }
            stack.push(curr);
        }
        return result;
    }
}