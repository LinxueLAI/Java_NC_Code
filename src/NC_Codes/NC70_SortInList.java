package NC_Codes;

import java.util.Scanner;

public class NC70_SortInList {

//    NC70 单链表的排序
    /*
    1. 冒泡 (超时)
    2. 归并排序
     */

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
//        ListNode head = node;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            node.addNode(sc.nextInt());
        }
        node.printList();

        ListNode result = sortInList(node);

        result.printList();
    }

    private static ListNode sortInList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // use a faster pointer and a lower pointer to find the mid point
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortInList(head);
        ListNode right = sortInList(tmp);

        // create new list chain
        ListNode newl = new ListNode(0);
        ListNode res = newl;

        // merge two list : left right
        while (left != null && right != null) {
            if (left.val < right.val) {
                newl.next = left;
                left = left.next;
            } else {
                newl.next = right;
                right = right.next;
            }

            newl = newl.next;
        }

        newl.next = left!=null? left :right;
        return res.next;
    }



}
