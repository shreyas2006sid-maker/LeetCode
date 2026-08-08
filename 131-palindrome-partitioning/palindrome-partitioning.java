class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(int index, String s,
                   List<String> current,
                   List<List<String>> ans) {

        if (index == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s, index, i)) {

                current.add(s.substring(index, i + 1));

                backtrack(i + 1, s, current, ans);

                current.remove(current.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}