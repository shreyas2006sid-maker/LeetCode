class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> inte=new ArrayList<>();

        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                inte.add(num);
                set.remove(num);
            }
        }
        int[] ans=new int[inte.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=inte.get(i);
        }
        return ans;
        
    }
}