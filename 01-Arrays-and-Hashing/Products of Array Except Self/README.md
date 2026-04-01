# Product of Array Except Self

## 📌 Problem Description
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

- **Constraint:** You must solve it in **$O(n)$** time and **without** using the division operator.
- **LeetCode Link:** [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
- **Difficulty:** Medium
- **Topic:** Arrays & Hashing / Prefix Sums

## 💡 Intuition and Logic
The core challenge is to "skip" the current number without dividing the total product. We achieve this by calculating the product of everything to the left and everything to the right of each index.

### 1. The Two-Pass Strategy
1.  **Prefix (Forward Pass):** We iterate from left to right. At each index `i`, we store the product of all elements from `0` to `i-1`.
2.  **Suffix (Backward Pass):** We iterate from right to left. We maintain a running `suffix` product variable. We multiply the existing prefix value at index `i` by this `suffix` variable.



### 2. Space Optimization
Instead of using two separate arrays (`prefix[]` and `suffix[]`), we use the `output` array to store prefixes first, then multiply the suffixes into it "live" during the backward pass. This reduces extra space complexity to **$O(1)$**.

## 🚀 Complexity Analysis
- **Time Complexity:** $O(n)$
    - Two linear passes through the array ($2n$ operations).
- **Space Complexity:** $O(1)$
    - We only use the output array (which typically doesn't count towards space complexity) and one extra `int` variable for the running suffix.

## 🛠️ Technical Context
This "Prefix/Suffix" pattern is vital for:
- **Financial Systems:** Calculating rolling balances or cumulative interest while excluding specific transaction windows.
- **Data Integrity:** Generating "rolling hashes" where you need to verify the state of a file if one specific block were removed or changed.

---
*Part of my NeetCode 150 journey. Moving from brute-force $O(n^2)$ to optimized $O(n)$ prefix patterns.*

---