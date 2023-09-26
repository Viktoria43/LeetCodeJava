/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> nodeMap = new HashMap<>();
        ListNode tmp = head;

        while (tmp != null) {
            if (nodeMap.containsKey(tmp)) {
                return tmp; // Found the starting node of the cycle
            }

            nodeMap.put(tmp, 1);
            tmp = tmp.next;
        }

        return null; // No cycle found
    }
}
