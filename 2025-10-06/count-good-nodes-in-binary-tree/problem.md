# **Count Good Nodes in Binary Tree**

Within a binary tree, a node x is considered good if the path from the root of the tree to the node x contains no nodes with a value greater than the value of node x

Given the root of a binary tree root, return the number of good nodes within the tree.

Example 1:

```
Input: root = [2,1,1,3,null,1,5]

Output: 3

```

Example 2:

```
Input: root = [1,2,-1,3,4]

Output: 4

```

Constraints:

- 1 <= number of nodes in the tree <= 100
- -100 <= Node.val <= 100



### Recommended Time & Space Complexity

You should aim for a solution with O(n) time andO(n) space, where n is the number of nodes in the given tree.


### Hint 1

A brute force solution would involve considering every node and checking if the path from the root to that node is valid, resulting in an O(n^2) time complexity. Can you think of a better approach?


### Hint 2

We can use the Depth First Search (DFS) algorithm to traverse the tree. But can you think of a way to determine if the current node is a good node in a single traversal? Maybe we need to track a value while traversing the tree.


### Hint 3

While traversing the tree, we should track the maximum value along the current path. This allows us to determine whether the nodes we encounter are good. We can use a global variable to count the number of good nodes.