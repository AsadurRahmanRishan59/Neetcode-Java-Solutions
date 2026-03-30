import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements obj = new TopKFrequentElements();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(obj.topKFrequent(nums, k)));
    }


    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies - O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 2. Use a Min-Heap to keep the Top K - O(N log K)
        // We want the smallest frequencies at the top so we can remove them
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the element with the lowest frequency
            }
        }

        // 3. Convert heap to result array - O(K log K)
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }
        return res;
    }
}
