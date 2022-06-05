import java.beans.Transient;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        ListNode listNode1 = new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode listNode2 = new ListNode(9,new ListNode( 9, new ListNode(9)));

        ListNode listNode = addTwoNumbers(listNode1,listNode2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        while (l1 != null || l2 != null){

            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            System.out.println(sum % 10);

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        System.out.println(carry);


    return null;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}