# 🌳 Trees (Binary Trees & BST)

This section contains solutions to Tree-based problems, focusing on traversal techniques, recursion, and common patterns used in technical interviews.

---

## 🧠 Key Concepts Covered

* Depth First Search (DFS)
* Breadth First Search (BFS)
* Tree Traversals (Preorder, Inorder, Postorder)
* Height / Depth of Tree
* Path-based Problems
* Tree Modification (Invert / Merge)
* Diameter & Balanced Trees

---

## 📂 Problem Structure

Each problem is organized as:

```
<problem-number>-<problem-name>/Solution.java
```

Example:

```
104-Maximum-Depth-of-Binary-Tree/Solution.java
```

---

## 📘 Problems Included

- **100** - Same Tree → Tree comparison  
- **102** - Binary Tree Level Order Traversal → BFS traversal  
- **104** - Maximum Depth of Binary Tree → DFS (height calculation)  
- **110** - Balanced Binary Tree → Optimized DFS  
- **112** - Path Sum → Root-to-leaf path check  
- **199** - Binary Tree Right Side View → BFS / level view  
- **226** - Invert Binary Tree → Structure modification  
- **235** - Lowest Common Ancestor of a BST → BST property  
- **236** - Lowest Common Ancestor of a Binary Tree → DFS  
- **543** - Diameter of Binary Tree → DFS + global state  
---

## 💡 Approach

Most tree problems are solved using recursion (DFS), where:

* Break the problem into left and right subtrees
* Combine results at the current node
* Use base case (`root == null`) to stop recursion

---

## ⏱ Complexity

| Operation     | Time | Space |
| ------------- | ---- | ----- |
| DFS Traversal | O(n) | O(h)  |
| BFS Traversal | O(n) | O(n)  |

* `n` = number of nodes
* `h` = height of tree

---

## 🚀 Notes

* Trees are recursive by nature — think in terms of subproblems
* Always identify:

  * What to return?
  * What to compute at each node?
* Practice both DFS and BFS patterns for strong interview preparation

---

## 📌 Goal

To build strong intuition for solving tree problems efficiently and confidently in interviews.
