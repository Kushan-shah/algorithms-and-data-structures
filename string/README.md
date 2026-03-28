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

## 📘 Problems

* **76** - Minimum Window Substring → Sliding Window
* **242** - Valid Anagram → Frequency Count
* **125** - Valid Palindrome → Two Pointers
* **49** - Group Anagrams → Hashing
* **2573** - Find the String with LCP → Greedy + Validation

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
