/*Author:���
*Time��10.11
*Question��ɾ�������ض��ڵ�
*Tips:����preָ��
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        ListNode pre = null;
        while(temp.next!=null){
            temp.val=temp.next.val;
            pre=temp;
            temp=temp.next;
            }pre.next=null;
            
            
    }
}