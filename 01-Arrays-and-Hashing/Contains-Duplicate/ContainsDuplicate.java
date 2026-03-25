import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 3};
        System.out.println("Has duplicate: " + c.hasDuplicate(nums));
    }

    /**
     * Problem: Contains Duplicate
     * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(n) - In the worst case, all elements are added to the Set.
     */
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true; // .add() returns false if item exists
        }
        return false;
    }
}