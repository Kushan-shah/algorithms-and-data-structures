# 🔤 Strings

This module covers core string manipulation techniques and patterns frequently used in coding interviews, including sliding window, hashing, two-pointer strategies, and constraint-based construction.

---

## 📌 Overview

String problems often require efficient handling of substrings, character frequency, and pattern matching. The focus is on optimizing brute-force approaches into linear-time solutions using well-known techniques.

---

## 🧠 Key Techniques

* **Sliding Window** → Efficient substring processing
* **Two Pointers** → Palindrome and comparison problems
* **Hashing / Frequency Count** → Anagrams, matching, grouping
* **Greedy Construction** → Building strings under constraints
* **Prefix / Suffix Logic** → Advanced string relationships

---

## 📂 Structure

Each problem is organized as:

```
<problem-number>-<problem-name>/Solution.java
```

Example:

```
76-Minimum-Window-Substring/Solution.java
```

---

## 🧩 Pattern Focus

This module emphasizes solving problems by recognizing patterns such as sliding window, hashing, and two-pointer techniques rather than brute force approaches.

---

## 📘 Problems

### 🔹 Sliding Window
- **76** - Minimum Window Substring → Optimal substring search  
- **3** - Longest Substring Without Repeating Characters → Unique window  

### 🔹 Two Pointers / Palindrome
- **125** - Valid Palindrome → Two pointer validation  
- **5** - Longest Palindromic Substring → Expand around center  

### 🔹 Hashing / Frequency
- **242** - Valid Anagram → Frequency counting  
- **49** - Group Anagrams → Hashing + sorting  

### 🔹 Index / Parity Logic
- **2839** - Check Strings Equal I → Fixed index swaps  
- **2840** - Check Strings Equal II → Even/Odd grouping  

### 🔹 Greedy / Construction
- **2573** - Find the String with LCP → Constraint-based construction + validation
- **3474** - Lexicographically Smallest Generated String → Greedy + constraint validation (hard)

### 🔹 Matrix / Traversal
- **2075** - Decode the Slanted Ciphertext → Matrix + diagonal traversal

### 🔹 Simulation
- **657** - Robot Return to Origin → Coordinate simulation
- **2069** - Walking Robot Simulation II → boundary simulation with direction control
---

## ⏱ Complexity

| Technique      | Time | Space       |
| -------------- | ---- | ----------- |
| Sliding Window | O(n) | O(1) / O(k) |
| Hashing        | O(n) | O(n)        |
| Two Pointers   | O(n) | O(1)        |

---

## 🚀 Notes

* Prefer `StringBuilder` for mutable operations
* Sliding Window is a high-frequency interview pattern
* Always aim to reduce O(n²) → O(n)
* Validate constructed strings in constraint-based problems

---

## 🎯 Goal

To build strong intuition for solving string problems efficiently using standard patterns and optimized approaches.
