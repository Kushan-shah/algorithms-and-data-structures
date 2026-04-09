# 🔢 Bit Manipulation

This section focuses on solving problems using bitwise operations such as XOR, AND, OR, and bit shifting. These techniques are commonly used for optimization and low-level computation in interviews.

---

## 📌 Overview

Bit manipulation involves operating directly on binary representations of numbers.
It helps reduce time and space complexity and is especially useful in problems involving subsets, uniqueness, and state compression.

---

## 🧠 Key Concepts

* **XOR Trick** → Cancels duplicate values
* **Bit Masking** → Represent subsets and states
* **Set / Unset Bits** → Using AND, OR operations
* **Bit Shifting** → Efficient multiplication/division by powers of 2
* **Checking Bits** → `(n & (1 << i))`

---

## 📂 Structure

Each problem is organized as:

```id="bitstruct1"
<problem-number>-<problem-name>/Solution.java
```

Example:

```id="bitstruct2"
136-Single-Number/Solution.java
```

---

## 📘 Problems

- **136** - Single Number → XOR to remove duplicates
- **191** - Number of 1 Bits → count set bits using bit trick
- **3653** - XOR After Range Multiplication Queries I → step traversal + modulo handling
- **3655** - XOR After Range Multiplication Queries II → sqrt decomposition + modular prefix updates  
---

## 🧩 Pattern Categories

### 🔹 XOR Based

* Finding unique elements
* Cancelling duplicates

### 🔹 Bit Masking

* Subset generation
* State representation

### 🔹 Bit Tricks

* Check even/odd
* Count set bits
* Power of two

---

## ⏱ Complexity

| Operation          | Time |
| ------------------ | ---- |
| Bitwise operations | O(1) |

---

## 🚀 Notes

* XOR is one of the most important tricks
* Bit masking is widely used in advanced problems
* Helps optimize brute-force solutions

---

## 🎯 Goal

To build strong intuition for bit-level operations and use them to optimize algorithms in interview problems.
