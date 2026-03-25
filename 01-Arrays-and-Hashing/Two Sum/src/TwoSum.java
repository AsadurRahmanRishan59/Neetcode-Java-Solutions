import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 7;

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        // Map to store: <Number, Index>
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // Check if the "partner" number exists in our map
            if (prevMap.containsKey(diff)) {
                // If it exists, return the stored index and current index
                return new int[]{prevMap.get(diff), i};
            }

            // Otherwise, store current number and its index for future checks
            prevMap.put(nums[i], i);
        }

        return new int[]{};
    }

}
