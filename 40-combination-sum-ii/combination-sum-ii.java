import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(0, target, candidates, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start, int target, int[] arr,
                           List<Integer> curr,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if (i > start && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            curr.add(arr[i]);

            backtrack(i + 1, target - arr[i], arr, curr, result);

            curr.remove(curr.size() - 1);
        }
    }
}