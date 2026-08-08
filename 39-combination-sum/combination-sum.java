class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int index,int[] candidate,int target,List<Integer> current,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==candidate.length||target<0){
            return;
        }
        current.add(candidate[index]);
        backtrack(index,candidate,target-candidate[index],current,ans);
        current.remove(current.size()-1);
        backtrack(index+1,candidate,target,current,ans);
    }
}