# **Min Cost Climbing Stairs**

You are given an array of integers cost where cost[i] is the cost of taking a step from the ith floor of a staircase. After paying the cost, you can step to either the (i + 1)th floor or the (i + 2)th floor.

You may choose to start at the index 0 or the index 1 floor.

Return the minimum cost to reach the top of the staircase, i.e. just past the last index in cost.

Example 1:

```
Input: cost = [1,2,3]

Output: 2

```

Explanation: We can start at index = 1 and pay the cost of cost[1] = 2 and take two steps to reach the top. The total cost is 2.

Example 2:

```
Input: cost = [1,2,1,2,1,1,1]

Output: 4

```

Explanation: Start at index = 0.

- Pay the cost of cost[0] = 1 and take two steps to reach index = 2.
- Pay the cost of cost[2] = 1 and take two steps to reach index = 4.
- Pay the cost of cost[4] = 1 and take two steps to reach index = 6.
- Pay the cost of cost[6] = 1 and take one step to reach the top.
- The total cost is 4.

Constraints:

- 2 <= cost.length <= 100
- 0 <= cost[i] <= 100



### Recommended Time & Space Complexity

You should aim for a solution as good or better than O(n) time and O(n) space, where n is the number of steps on the staircase.


### Hint 1

Can you find the recurrence relation to solve the problem, given that at each step we have two options: going one step or two steps? Consider drawing a decision tree where we branch into two paths at each step. By exploring every path, we can get the minimum cost. However, this results in an O(2^n) time solution. Can you think of a better approach? Is there any repeated work in the decision tree that we can optimize?


### Hint 2

The recurrence relation can be expressed as cost[i] + min(dfs(i + 1), dfs(i + 2)), where i is the current position and dfs is the recursive function. To avoid recalculating the result of a recursive call multiple times, we can use Memoization. Initialize a cache array of size n, where n is the number of steps on the staircase. How would you implement this?


### Hint 3

We start the recursion from positions 0 and 1. At each recursive step, before computing the result, we check if the result for the current position has already been calculated. If it has, we return the stored value. Otherwise, we calculate the result for the current position, store it in the cache, and then return the result. What can be the base condition for this recursion to stop?


### Hint 4

The base condition would be to return 0 if we are at the top of the staircase i >= n. This is a one-dimensional dynamic programming problem. We can further optimize the memoization solution by using advanced techniques such as Bottom-Up dynamic programming based on the recurrance relation.