import java.util.*;

public class Reverse_LinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b; b.next = c; c.next = d; d.next = e;

        ListNode anw = reverseList(a);

        while(anw != null){
            System.out.println(anw.val);
            anw = anw.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        return reverseListInt(head, null);
    }

    private static ListNode reverseListInt(ListNode head, ListNode newHead){
        if(head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;

        return reverseListInt(next, head);
    }

    public static ListNode reverseListIteratively(ListNode head) {
       ListNode newHead = null;

       while(head != null){
           ListNode next = head.next;
           head.next = newHead;
           newHead = head;
           head = next;
        }

       return newHead;
    }
}
