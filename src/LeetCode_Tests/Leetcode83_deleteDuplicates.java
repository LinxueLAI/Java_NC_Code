package LeetCode_Tests;

public class Leetcode83_deleteDuplicates {
    public static void main(String[] args) {

        int[] arrayOfValue = {0, 0, 1, 1, 2, 2, 3};
        ListNode dummy_head = new ListNode(0); //如何建立链表？

        ListNode curr = dummy_head;
        for (int i = 0; i < arrayOfValue.length; i++) {
            ListNode tmpNode = new ListNode(arrayOfValue[i]);
            curr.next = tmpNode;
            curr = curr.next;
        }

        ListNode head = dummy_head.next;
        ListNode head1 = dummy_head.next;
        System.out.println("firstly print the original nodeList:");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        ListNode res = deleteDuplicates(head1);

        System.out.println("Then print the final nodeList:");
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p1 = head;
        while (p1.next != null) {
            if (p1.val == p1.next.val) {
                p1.next = p1.next.next;
            } else {
                p1 = p1.next;
            }
        }
        return head;
    }
}
