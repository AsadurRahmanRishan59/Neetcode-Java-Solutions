# Valid Anagram

## 📌 Problem Description
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

- **NeetCode Link:** [Valid Anagram](https://neetcode.io/problems/is-anagram/question)
- **Difficulty:** Easy
- **Topic:** Arrays & Hashing

## 💡 Intuition and Logic
An anagram requires both strings to have the exact same characters with the exact same frequencies, regardless of their order.

1. **The Frequency Array (Fixed-Size):** Since the input consists of lowercase English letters ('a'-'z'), we use an `int[26]` array. This is more memory-efficient than a `HashMap` because it avoids object overhead and hashing collisions.
2. **The "Tally" Optimization:** Instead of creating two separate arrays and comparing them, we use a single array.
    - We increment the count for characters in string `s`.
    - We decrement the count for characters in string `t`.
    - If the strings are anagrams, the final count for every character must be exactly zero.
3. **Performance Guard:** We perform an $O(1)$ check on the lengths of both strings. if `s.length() != t.length()`, they cannot be anagrams.



## 🚀 Complexity Analysis
- **Time Complexity:** $O(n)$
    - We iterate through the strings exactly once to populate the tally and once more through the fixed-size array (26 iterations).
- **Space Complexity:** $O(1)$
    - The space used is constant ($O(26)$) and does not scale with the size of the input strings.

## 🛠️ Technical Context (Real-World Application)
In **InsurTech** or **FinTech** systems, this type of frequency analysis is used for:
- **Data Deduplication:** Identifying if two user-submitted strings are permutations of each other before saving to a database.
- **Security Checksums:** Basic validation to ensure that a string has not been tampered with or rearranged during transmission in low-security environments.

---
*Part of my NeetCode 150 journey to master computational efficiency in Java.*

---