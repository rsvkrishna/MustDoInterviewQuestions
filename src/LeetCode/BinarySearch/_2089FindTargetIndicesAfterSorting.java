package LeetCode.BinarySearch;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _2089FindTargetIndicesAfterSorting {
    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ans=new LinkedList<Integer>();

        Arrays.parallelSort(nums);


        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 2, 3 };
        int val = 2;
        List<Integer> ans = targetIndices(nums, val);

        // Loop to print indices
        for (int i = 0; i < ans.size(); i++) {
             System.out.print(ans.get(i) + " ");
        }
    }
}
