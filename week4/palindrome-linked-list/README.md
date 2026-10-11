1. Problem
I need to check if a linked list reads the same from both directions.
2. Approach
First, I copy all the numbers into an ArrayList. Then I compare the first number with the last number.
After that, I compare the second number with the second-last number. I continue until I reach the middle.
If two numbers are different, I return false. If all pairs match, I return true.
3. Time Complexity
O(n)
I go through the list to copy the numbers and then compare them. Both operations depend on the number of nodes, so the total time complexity is O(n).
4. Reflection / Improvement
I could use two pointers to find the middle, reverse the second half of the list, and compare both halves.
This would still take O(n) time but use only O(1) extra space.