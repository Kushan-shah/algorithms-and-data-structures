# 🌐 Graphs (BFS, DFS, Shortest Path & More)

This section contains solutions to Graph-based problems, covering traversal techniques, grid-based problems, and advanced graph algorithms commonly asked in technical interviews.

---

## 🧠 Key Concepts Covered

* Depth First Search (DFS)
* Breadth First Search (BFS)
* Multi-source BFS
* Grid-based traversal
* Connected Components
* Shortest Path (BFS / Dijkstra)
* Cycle Detection (Directed & Undirected)
* Topological Sort

---

## 📂 Problem Structure

Each problem is organized as:

```
<problem-number>-<problem-name>/Solution.java
```

Example:

```
200-Number-of-Islands/Solution.java
```

---

## 📘 Problems Included

* **200** - Number of Islands → DFS on grid
* **994** - Rotting Oranges → Multi-source BFS
* **733** - Flood Fill → DFS traversal
* **542** - 01 Matrix → Multi-source BFS

---

## 💡 Approach

Graph problems are typically solved using:

### 🔹 DFS (Depth First Search)

* Used for traversal, connected components, recursion-based exploration
* Common in grid problems (Islands, Flood Fill)

### 🔹 BFS (Breadth First Search)

* Used for shortest path in unweighted graphs
* Level-by-level traversal
* Queue-based implementation

### 🔹 Multi-Source BFS

* Start BFS from multiple nodes simultaneously
* Useful in problems like Rotting Oranges, 01 Matrix

---

## ⏱ Complexity

| Operation      | Time     | Space    |
| -------------- | -------- | -------- |
| DFS Traversal  | O(V + E) | O(V)     |
| BFS Traversal  | O(V + E) | O(V)     |
| Grid Traversal | O(m × n) | O(m × n) |

* `V` = vertices (nodes)
* `E` = edges
* `m × n` = grid size

---

## 🚀 Notes

* Always identify whether the problem is:

  * Graph-based or grid-based
* Choose:

  * DFS → for traversal / recursion
  * BFS → for shortest path / levels
* Use `visited` array or modify input to avoid revisiting nodes
* Multi-source BFS is a key optimization pattern

---

## 📌 Goal

To build strong intuition for solving graph problems efficiently using DFS, BFS, and advanced graph algorithms for real interview scenarios.
