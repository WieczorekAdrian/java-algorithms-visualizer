#  Java Algorithms Visualizer

An educational project designed to provide a deep understanding of data structures by **implementing them from scratch** (without using `java.util.*` collections).

The application includes a visualization layer (REST API + Frontend) that allows observing pointer behavior and structure states in real-time.

## Implemented Structures

All structures were built using raw logic, pointers (references), and arrays:

### 1. `MyArrayList` (Dynamic Array)
- **Logic:** An array that automatically resizes itself when full (manual data copying).
- **Features:** `add`, `get`, `remove` (with element shifting logic).

### 2. `MyLinkedList` (Singly Linked List)
- **Logic:** Reference manipulation (`Node next`). No index-based access, pure memory traversal.
- **Features:**
  - `addLast` / `add(index)` (surgical node insertion logic).
  - `remove(index)` (safe pointer rewiring, handling `head` removal).
  - `reverse()` (in-place list reversal algorithm using 3 pointers).

### 3. `MyStack` (LIFO)
- Wrapper around the custom Linked List.
- Operations restricted to the "top" of the stack (`push`, `pop`, `peek`).

### 4. `MyQueue` (FIFO)
- Wrapper around the custom Linked List.
- Insert at the back (`enqueue`), remove from the front (`dequeue`).

### 5. `MyTree` (Binary Search Tree - BST)
- **Logic:** Binary tree that sorts elements dynamically during insertion.
- **Algorithm:** Iterative insertion (`while(true)`) with binary decision logic (left vs. right).

##  Tech Stack

* **Java 21+** - Core logic implementation.
* **Spring Boot** - REST API for frontend communication.
* **Mermaid.js** - Graph and tree visualization on the client side.

##  Key Takeaways

* Deep understanding of memory management and object references in Java (`null`, pointers).
* Practical grasp of time complexity differences (Array vs. List).
* Building complex structures (Trees, Stacks) from simple building blocks (Nodes).
* Handling critical Edge Cases manually.

---

### Author
Created as part of a deep dive into algorithms and "under the hood" data structure mechanics.
