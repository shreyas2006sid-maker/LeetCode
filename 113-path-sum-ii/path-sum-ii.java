/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        f(root,targetSum,ans,curr);
        return ans;
    }
    void f(TreeNode root,int t,List<List<Integer>> ans,List<Integer> curr){
        if(root==null)return;
        curr.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==t){
                ans.add(new ArrayList<>(curr));
            }

        }else{
            f(root.left,t-root.val,ans,curr);
            f(root.right,t-root.val,ans,curr);
        }
        curr.remove(curr.size()-1);
    }
}