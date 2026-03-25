# Two Sum

## 📌 Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

- **NeetCode Link:** [Two Sum](https://neetcode.io/problems/two-integer-sum/question)
- **Difficulty:** Easy
- **Topic:** Arrays & Hashing

## 💡 Intuition and Logic
The goal is to find two numbers, $x$ and $y$, such that $x + y = target$.

### 1. The Brute Force ($O(n^2)$)
A nested loop would compare every pair of numbers. This is slow because for every number, we are "searching" the rest of the array for its complement.

### 2. The Optimized One-Pass Hash Map ($O(n)$)
Instead of searching the array repeatedly, we can use a **HashMap** to remember the numbers we have seen so far and their positions (indices).

1. **The Complement:** As we iterate through the array, we calculate the required value: `diff = target - current_number`.
2. **The Lookup:** We check if `diff` already exists in our HashMap.
    - **If it exists:** We found the pair! We return the stored index and the current index.
    - **If it doesn't:** We store the `current_number` as the **Key** and its `index` as the **Value** in the map and move to the next element.
3. **No Self-Matching:** By checking the map *before* adding the current number, we ensure we don't use the same element twice (e.g., if the target is 6 and the number is 3).



## 🚀 Complexity Analysis
- **Time Complexity:** $O(n)$
    - We traverse the list containing $n$ elements only once. Each lookup in the table costs only $O(1)$ time.
- **Space Complexity:** $O(n)$
    - The extra space required depends on the number of items stored in the hash table, which stores at most $n$ elements.

## 🛠️ Technical Context (Real-World Application)
In **FinTech** platforms or **InsurTech** systems like the one you're building:
- **Transaction Matching:** Quickly identifying pairs of transactions that cancel each other out (e.g., a credit and a debit totaling a specific settlement amount).
- **Audit Logging:** Efficiently linking related logs where a unique identifier and a timestamp sum up to a specific batch window.

---
*Part of my NeetCode 150 journey. Moving from $O(n^2)$ to $O(n)$ efficiency.*

---