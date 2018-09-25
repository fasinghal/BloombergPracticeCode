package leetorg4g;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 6, 7};
        int sum = 8;
        int ans[] =twoSum(numbers, sum);
    }

    public static int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            Integer temp = target - a[i];
            if (h.containsKey(temp)) {
                ans[0] = i;
                ans[1] = h.get(temp);
            }
            h.put(a[i], i);
        }
        Arrays.sort(ans);
        return ans;
    }

    /* Best Solution
    * class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff) && numMap.get(diff) != i) {
                return new int[]{i, numMap.get(diff)};
            }
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }
    }
    *
    * */
}
