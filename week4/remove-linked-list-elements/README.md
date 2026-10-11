1. Problem
I need to remove all nodes that have a given value from a linked list.
For example, if the value is 6, I need to remove every 6.
2. Approach
I create a dummy node before the first node. This helps if the first node also needs to be removed.
I check the next node. If its value is the one I want to remove, I skip it. Otherwise, I move forward.
I repeat this until I reach the end of the list.
3. Time Complexity
O(n)
I check each node once, so the time depends on the number of nodes.
4. Reflection / Improvement
I think this solution is already efficient because I need to check every node to know whether it should be removed.