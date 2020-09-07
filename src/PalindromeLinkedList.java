import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head){
        /*
        List<Integer> listNode = new ArrayList<Integer>();

        while(head != null){
            listNode.add(head.val);
            head = head.next;
        }

        int length = listNode.size();
        boolean anw = true;

        if(length<=1)
            return anw;

        for(int index=0; index<length/2;index++){
            if(!listNode.get(index).equals(listNode.get(length-1-index)))    {
                anw = false;
                return false;
            }

        }

        return anw;
         */
       ListNode temp = head;
       Stack stack = new Stack();

       while(temp != null){
           stack.push(temp.val);
           temp = temp.next;
       }

       while(head != null){
           if(head.val != (int)stack.pop()){
               return false;
           }
           head = head.next;
       }

       return true;

    }
}
