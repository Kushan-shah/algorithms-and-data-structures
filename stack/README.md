🗂 Stack (Monotonic Stack, Simulation & Expression Handling)

This section focuses on problems solved using Stack-based techniques, including monotonic stacks, collision simulations, and expression evaluation patterns commonly asked in technical interviews.

---

📌 Overview

A stack is a Last-In-First-Out (LIFO) data structure used to process elements in a controlled order.
It is especially useful for problems involving ordering, matching, and sequential processing.

---

🧠 Key Concepts

- Monotonic Stack → Maintain increasing/decreasing order
- Simulation using Stack → Collision / interaction problems
- Next Greater / Smaller Element
- Expression Evaluation
- Parentheses Matching
- Greedy decisions with stack

---

📂 Structure

Each problem is organized as:

<problem-number>-<problem-name>/Solution.java

Example:

2751-Robot-Collisions/Solution.java

---

📘 Problems

## 🔹 Simulation
- **2751** - Robot Collisions → Stack + collision handling  
- **735** - Asteroid Collision → Stack-based simulation  

## 🔹 Parentheses / Matching
- **20** - Valid Parentheses → Basic stack matching  
- **32** - Longest Valid Parentheses → Stack + index tracking  

## 🔹 Monotonic Stack
- **84** - Largest Rectangle in Histogram → Advanced monotonic stack  
---

🧩 Pattern Categories

🔹 Monotonic Stack

- Used for next greater/smaller problems
- Helps optimize from O(n²) → O(n)

🔹 Simulation

- Used when elements interact (collisions, elimination)
- Stack helps track active elements

🔹 Expression & Matching

- Parentheses validation
- Infix/Postfix evaluation

---

⏱ Complexity

Pattern| Time| Space
Stack Traversal| O(n)| O(n)
Monotonic Stack| O(n)| O(n)
Simulation| O(n)| O(n)

---

🚀 Notes

- Use stack when order of processing matters
- Always check top element before pushing
- Think in terms of:
  - “What should stay?”
  - “What should be removed?”
- Monotonic stack is one of the most important interview patterns

---

🎯 Goal

To master stack-based problem solving, including monotonic patterns and simulation techniques, for efficient and optimal solutions in interviews.
