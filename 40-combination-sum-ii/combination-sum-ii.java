import java.util.*;

class Solution {
    public void solve(int[] candidates, int target, int start, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            list.add(candidates[i]);
            solve(candidates, target - candidates[i], i + 1, list, result); // move to the next index
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        solve(candidates, target, 0, list, result);
        return result;
    }
}
