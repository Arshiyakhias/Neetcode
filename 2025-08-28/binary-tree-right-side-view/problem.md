# **Binary Tree Right Side View**

You are given the root of a binary tree. Return only the values of the nodes that are visible from the right side of the tree, ordered from top to bottom.

Example 1:

```
Input: root = [1,2,3]

Output: [1,3]

```

Example 2:

```
Input: root = [1,2,3,4,5,6,7]

Output: [1,3,7]

```

Constraints:

- 0 <= number of nodes in the tree <= 100
- -100 <= Node.val <= 100



### Recommended Time & Space Complexity

You should aim for a solution with O(n) time and O(n) space, where n is the number of nodes in the given tree.


### Hint 1

In the right-side view of a tree, can you identify the nodes that are visible? Maybe you could traverse the tree level by level and determine which nodes are visible from the right side.


### Hint 2

The nodes visible in the right-side view are the last nodes at each level of the tree. Can you think of an algorithm to identify these nodes? Maybe an algorithm that can traverse the tree level by level.


### Hint 3

We can use the Breadth First Search (BFS) algorithm to traverse the tree level by level. Once we completely visit a level, we take the last node of that level and add it to the result array. After processing all levels, we return the result.