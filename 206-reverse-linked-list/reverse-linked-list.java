/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        }
        Stack <ListNode> stack = new Stack<>();
        ListNode tmp = head;
    ListNode newHead = null;
  
     //   System.out.println(stack);
       
        while (tmp!=null) {
   ListNode  node = stack.push(tmp);
   System.out.println(tmp.val);

tmp = tmp.next;
 
        
  // Assuming 'val' is the value of the ListNode
    }
//     tmp=head ;
        if (!stack.isEmpty()) {
            newHead = stack.pop();
            tmp = newHead;
        }
        
        while (!stack.isEmpty()) {
            tmp.next = stack.pop();
            tmp = tmp.next;
        }
        
        // Set the next of the last node to null to terminate the reversed list
        tmp.next = null;

        return newHead; // Return the new head of the reversed list
    }}
