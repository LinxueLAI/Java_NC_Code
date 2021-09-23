package NC_Codes;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class NC96_isPail {

    public static void main(String[] args) {


        ListNode node = new ListNode(1);
//        ListNode head = node;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            node.addNode(sc.nextInt());
        }
        node.printList();

        boolean result = isPail2(node);
        System.out.println(result);
    }

    private static boolean isPail2(ListNode head) {
        if (head == null)
            return false;

        ListNode fast = head, slow = head; // two pointers
        while (fast != null && fast.next != null) {
            // 1 ->2->3->2 ->1   1->2->2->1
        /*
        1 :  slow = 1, fast ->2  left : 1
        2 : slow = 2 , fast =2   left = 1->2
        3: slow = 3, faster = null left = 1->2->3

         */
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseList = reverse(slow);
        ListNode headright = reverseList;
        while (headright!=null){
            if(headright.val!= head.val){
                return false;
            }
            headright =headright.next;
            head = head.next;
        }

        return true;


    }

    private static ListNode reverse(ListNode head) {
        ListNode curr = head, pre = null;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    private static boolean isPail(ListNode head) {
        if (head == null || head.next == null)
            return false;
        int n_node = 0;

        ListNode first = head;
        while (first.next != null) {
            n_node += 1;
            first = first.next;
        }
        System.out.println("n_node =" + n_node);
        ListNode fast = head.next, slow = head; // two pointers
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            // 1 ->2->3->2 ->1   1->2->2->1
        /*
        1 :  slow = 1, fast ->3  left : 1
        2 : slow = 2 , fast =1   left = 1->2
         */
            slow = slow.next;
            stack.push(slow.val);
            System.out.println("pushed : " + slow.val);
            fast = fast.next.next;
//            System.out.println("fast : " + fast.val);
        }
        System.out.println("size of stake =" + stack.size());
        System.out.println("n_node =" + n_node);

        if (n_node % 2 == 1) {
            slow = slow.next;
        }
        n_node = n_node / 2;

        System.out.println("n_node =" + n_node);
        slow = slow.next;
        System.out.println("2 =  " + slow.val);
        while (n_node > 0) {
            n_node -= 1;
            System.out.println("slow.val = " + slow.val);
            System.out.println("stack.peak =" + stack.peek());
            if (stack.pop() != slow.val)
                return false;
            slow = slow.next;
        }
        return true;
    }

}
