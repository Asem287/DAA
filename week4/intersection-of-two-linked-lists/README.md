1. Problem
I need to find the node where two linked lists meet. The nodes must be the same, not just have the same number.
2. Approach
I use two loops. First, I take a node from the first list. Then I compare it with every node in the second list.
If I find the same node, I return it. If I check all the nodes and find no match, I return null.
3. Time Complexity
O(m × n)
I compare each node in the first list with the nodes in the second list. In the worst case, I need to check almost every possible pair.
Here, m and n are the numbers of nodes in the two lists.
4. Reflection / Improvement
I could use two pointers and make them switch lists when they reach the end. This would be faster and have O(m + n) time complexity. It would still use O(1) extra space.