# 🧠 Dynamic Programming (DP)

This section focuses on solving problems using Dynamic Programming by breaking them into smaller overlapping subproblems and storing intermediate results to optimize performance.

---

## 📌 Overview

Dynamic Programming is used when a problem can be divided into subproblems that are reused multiple times.
The goal is to convert exponential-time solutions into polynomial-time solutions.

---

## 🧠 Key Concepts

* **State Definition** → What does `dp[i]` represent?
* **Transition (Recurrence)** → How to build from previous states
* **Base Case** → Starting condition
* **Memoization vs Tabulation**
* **Space Optimization**

---

## 📂 Structure

Each problem is organized as:

```id="sn1baf"
<problem-number>-<problem-name>/Solution.java
```

Example:

```id="i2dr5m"
70-Climbing-Stairs/Solution.java
```

---

## 📘 Problems

*(Updating as more problems are added)*

---

## 🧩 Pattern Categories

### 🔹 1D DP

* Fibonacci-type problems
* Decision-based problems

### 🔹 Knapsack Pattern

* Choice: take / not take
* Subset and partition problems

### 🔹 Grid DP

* Path counting
* Minimum cost path

### 🔹 Subsequence DP

* Longest Increasing Subsequence
* Longest Common Subsequence

---

## ⏱ Complexity

| Approach     | Time        | Space |
| ------------ | ----------- | ----- |
| Recursion    | Exponential | Stack |
| Memoization  | O(n)        | O(n)  |
| Tabulation   | O(n)        | O(n)  |
| Optimized DP | O(n)        | O(1)  |

---

## 🚀 Notes

* Always identify the **state and transition** first
* Convert recursion → DP
* Try to optimize space where possible
* DP is about recognizing patterns, not memorizing solutions

---

## 🎯 Goal

To develop strong intuition for identifying DP patterns and solving complex problems efficiently in interviews.
