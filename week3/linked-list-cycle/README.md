1. Problem
The task is to check whether a linked list contains a cycle.
A cycle happens when a node points back to a node that we have already visited.
For example, the last node can point back to the node with value 2. In this case, the list has a cycle.
2. Approach
I use a HashSet to remember the nodes that I have already visited.
I start from the first node and move through the list one node at a time.
Before moving to the next node, I check whether the current node is already in the HashSet.
If the node is already there, I return true because the list has a cycle.
If I reach null, I return false because there is no cycle.
3. Time Complexity
O(n)
The algorithm visits each node and checks whether it has been visited before. Here, n is the number of nodes in the list.
4. Reflection / Improvement
I learned how to detect a cycle by remembering the nodes that I have already visited.
One possible improvement is Floyd's Cycle Detection Algorithm. It uses two pointers: one moves one step at a time, and the other moves two steps at a time.
If the pointers meet, there is a cycle.