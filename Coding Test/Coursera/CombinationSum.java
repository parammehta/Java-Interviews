import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int target = 4;
        CombinationSum combSum = new CombinationSum();
        System.out.println(combSum.combinationSum(arr, target));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void combinationSum(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target, int start) {
        if (target > 0) {
            for (int i = start; i < candidates.length; i++) { // not using the condition "target >= candidates[i]"
                cur.add(candidates[i]);
                combinationSum(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }
        }
        if (target == 0)
            result.add(new ArrayList<>(cur));
    }
}
