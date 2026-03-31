# Encode and Decode Strings

## 📌 Problem Description
Design an algorithm to encode a list of strings to a single string. This encoded string is then sent over the network and decoded back to the original list of strings.

- **NeetCode Link:** [Encode and Decode Strings](https://neetcode.io/problems/string-encode-and-decode/question)
- **Difficulty:** Medium
- **Topic:** Arrays & Hashing / Design

## 💡 Intuition and Logic
The challenge is handling "Special Characters." If we use a simple delimiter like a comma or space, the algorithm will break if the input data itself contains that character.

1.  **Chunked Encoding (TLV Pattern):** We use a **Length-Prefix** followed by a delimiter (`#`).
    - Input: `["lint", "code"]`
    - Process: `4` (length of lint) + `#` + `lint` + `4` (length of code) + `#` + `code`
    - Result: `"4#lint4#code"`
2.  **Decoding:** The decoder reads the string until it hits the `#`, parses the number before it, and knows exactly how many characters to read next. This makes the delimiter inside the actual string data irrelevant.

## 🚀 Complexity Analysis
- **Time Complexity:** $O(n)$
    - We process each character exactly once for both encoding and decoding.
- **Space Complexity:** $O(n)$
    - To store the encoded string and the resulting list.

## 🛠️ Technical Context
This is a fundamental concept in **Cybersecurity** and **System Design**:
- **Protocol Buffers / MessagePack:** Use similar length-prefixed encoding for high-speed data serialization.
- **WAF (Web Application Firewall):** Attackers often try to use "Delimiter Injection" to bypass security filters; length-prefixed protocols are naturally resistant to this.

---
*Part of my NeetCode 150 journey. Moving toward high-performance, secure data serialization.*

---