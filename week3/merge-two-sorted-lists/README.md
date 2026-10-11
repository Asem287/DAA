1. Problem
The task is to merge two sorted linked lists into one sorted list.
2. I compare the values of the two lists one by one.
First, I create a dummy node to make it easier to build the result. Then I compare the current values of both lists and choose the smaller one.
After choosing a node, I move to the next node in that list. I repeat this process until one list becomes empty.
Finally, I add the remaining nodes from the other list.
3. Time Complexity
O(n + m)
The algorithm checks each node from both lists. Here, n is the number of nodes in the first list, and m is the number of nodes in the second list.
4. I learned how to compare two sorted lists and combine them into one sorted list.
The solution is already efficient because every node needs to be checked. One possible improvement is to make the code shorter, but the current version is easier for me to understand.