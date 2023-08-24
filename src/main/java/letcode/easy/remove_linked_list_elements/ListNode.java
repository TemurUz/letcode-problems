package letcode.easy.remove_linked_list_elements;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public void setVal(int val){
        this.val = val;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                "next" + next +
                '}';
    }
}
