# Top K Frequent Elements

## 📌 Problem Description
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in any order.

- **LeetCode Link:** [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
- **Difficulty:** Medium
- **Topic:** Arrays & Hashing / Heap

## 💡 Intuition and Logic
To find the most frequent elements without sorting the entire array, we combine a **HashMap** for counting and a **Min-Heap** for filtering.

1.  **Frequency Mapping:** We use a `HashMap<Integer, Integer>` to count the occurrences of each number. This takes $O(n)$ time.
2.  **The Min-Heap Strategy:** Instead of a Max-Heap (which would store all $n$ unique elements), we use a **Min-Heap** of size **$k$**.
    * We add elements to the heap one by one.
    * If the heap size exceeds $k$, we `poll()` (remove) the element with the **lowest** frequency.
    * By the end of the loop, the heap only contains the $k$ elements with the highest frequencies.
3.  **Efficiency:** This approach is optimized for cases where $k$ is much smaller than the number of unique elements.



## 🚀 Complexity Analysis
- **Time Complexity:** $O(n \log k)$
    - $n$ is the number of elements to count frequencies.
    - Each of the $n$ elements is added to a heap of size $k$. Insertion/Removal in a heap of size $k$ takes $O(\log k)$.
- **Space Complexity:** $O(n + k)$
    - $O(n)$ to store the frequencies in the HashMap.
    - $O(k)$ to store the top elements in the PriorityQueue.

## 🛠️ Technical Context
In a professional **InsurTech** backend:
- **Risk Analysis:** Identifying the "Top K" most common reasons for claim denials to improve automated processing.
- **Performance Monitoring:** Finding the $k$ slowest API endpoints in a high-traffic environment using a sliding window of logs.

---
*Part of my NeetCode 150 journey. Mastering PriorityQueues for efficient data retrieval.*

---