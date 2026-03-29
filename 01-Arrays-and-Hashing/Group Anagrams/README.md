# Group Anagrams

## 📌 Problem Description
Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

- **NeetCode Link:** [Group Anagrams](https://neetcode.io/problems/anagram-groups/question)
- **Difficulty:** Medium
- **Topic:** Arrays & Hashing

## 💡 Intuition and Logic
The core idea is that all anagrams, when sorted alphabetically, result in the **exact same string**.

1.  **The Categorization Key:** For each string, we convert it to a character array and sort it. For example, `"eat"`, `"tea"`, and `"ate"` all become `"aet"` when sorted.
2.  **The HashMap Grouping:** We use a `HashMap` where the **Key** is the sorted string and the **Value** is a `List` of all original strings that match that sorted key.
3.  **Efficiency:** By using `computeIfAbsent`, we handle the initialization of new groups in a single line of code.



## 🚀 Complexity Analysis
- **Time Complexity:** $O(n \cdot k \log k)$
    - $n$ is the number of strings and $k$ is the maximum length of a string. We sort every string.
- **Space Complexity:** $O(n \cdot k)$
    - To store the groups in the hash map.

## 🛠️ Technical Context
In a **FinTech** environment, grouping logic is used for:
- **Batch Processing:** Grouping transactions by a normalized reference code.
- **Data Sanitization:** Cleaning up user input where variations of the same name or category might be submitted in different character orders.

---
*Part of my NeetCode 150 journey. Balancing readability with algorithmic efficiency.*

---
 