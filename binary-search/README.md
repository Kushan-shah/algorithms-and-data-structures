# Binary Search

Binary Search is an efficient algorithm for searching over a **sorted or monotonic search space**. It works by repeatedly dividing the search interval in half.

---

## Concepts

* Sorted / Monotonic Search Space
* Midpoint Calculation (overflow-safe)
* Search Space Reduction
* Lower Bound / Upper Bound
* First True / Last False Pattern
* Binary Search on Answer

---

## Template (Java)

```java
int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }

    return -1;
}
```

---

## Binary Search on Answer

```java
int solve() {
    int low = 1, high = 1_000_000_000;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (isPossible(mid)) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return low;
}
```

---

## Problems

* Binary Search (Classic, O(log n))
* Lower Bound / Upper Bound
* Search in Rotated Sorted Array
* Find Peak Element
* Koko Eating Bananas
* Ship Packages Within D Days
* Split Array Largest Sum
* Aggressive Cows

---

## Complexity

* Time: O(log n)
* Space: O(1)
