# Contains Duplicate

## 📌 Problem Description
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

- **NeetCode Link:** [Contains Duplicate](https://neetcode.io/problems/duplicate-integer/question)
- **Difficulty:** Easy
- **Topic:** Arrays & Hashing

## 💡 Intuition and Logic
The goal is to efficiently check for the existence of duplicates.

1. **The Choice of Data Structure:** I used a `HashSet` because it offers $O(1)$ average time complexity for both search (`contains`) and insertion (`add`).
2. **The Optimization (Early Exit):** Instead of adding all elements to a set and comparing the final size to the array length, I check for existence *during* the iteration. This allows the algorithm to return `true` the moment the first duplicate is encountered, saving unnecessary processing time.
3. **Java Implementation Detail:** Using the `Set<Integer>` interface with the `HashSet` implementation follows best practices for loose coupling in Java.

## 🚀 Complexity Analysis
- **Time Complexity:** $O(n)$
    - We traverse the array exactly once. Each lookup and insertion in the `HashSet` takes $O(1)$ on average.
- **Space Complexity:** $O(n)$
    - In the worst-case scenario (no duplicates), we store all $n$ elements in the `HashSet`.

## 🛠️ Technical Context (Real-World Application)
In enterprise systems like **InsurTech ERPs**, this logic is foundational for data integrity. For example, when bulk-uploading **Policy IDs** or **User Identifiers**, we must validate that no duplicate entries exist before persisting data to a relational database (PostgreSQL/SQL Server) to avoid unique constraint violations.

---
*Part of my NeetCode 150 journey to master computational efficiency in Java.*