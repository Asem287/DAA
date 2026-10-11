1. Problem
I need to remove repeated numbers from a sorted linked list. I should keep only one copy of each number.
2. Approach
I use a pointer called current to move through the list.
I compare the current number with the next number. If they are the same, I skip the next node. If they are different, I move to the next node.
3. Time Complexity
O(n)
I go through the list once. If there are more nodes, I need to check more nodes.
5. Reflection / Improvement
I think this solution is already good for a sorted list. If the list was not sorted, I would need another way to find repeated numbers.