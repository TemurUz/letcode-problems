package uz.tioma.easy.remove_linked_list_elements;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * <p>
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 * <p>
 * Example 2:
 * Input: head = [], val = 1
 * Output: []
 * <p>
 * Example 3:
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(6);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(4);
        ListNode head6 = new ListNode(5);
        ListNode head7 = new ListNode(6);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        System.out.println(head1);
//        System.out.println(removeElements(head1, 6));
        deleteNode(head6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cut = dummy;
        while (cut.next != null){
            if (cut.next.val == val){
                cut.next = cut.next.next;
            }else
                cut  = cut.next;
        }
        return dummy.next;
    }

//    public static ListNode removeElementsRec(ListNode head, int val) {
//        if(head == null)
//            return null;
//        ListNode newNext = removeElementsRec(head.next, val);
//        if(head.val == val) {
//            return newNext;
//        } else {
//            head.next = newNext;
//            return head;
//        }
//    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        System.out.println(node.val);
    }
}
