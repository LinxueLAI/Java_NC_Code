package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode2_addTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListNode dummyHead1 = new ListNode(0);
        ListNode l1 = dummyHead1;
        for (int i = 0; i < 5; i++) {
            ListNode tmpNode = new ListNode(sc.nextInt());
            l1.next = tmpNode;
            l1 = tmpNode;
        }
        ListNode dummyHead2 = new ListNode(0);
        ListNode l2 = dummyHead2;
        for (int i = 0; i < 5; i++) {
            ListNode tmpNode = new ListNode(sc.nextInt());
            l2.next = tmpNode;
            l2 = tmpNode;
        }
        ListNode result = addTwoNumbers(dummyHead1.next, dummyHead2.next);
        for (int i = 0; i < 5; i++) {
            System.out.print(result.val);
            result = result.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        while (l1 != null && l2 != null) {
            int tmp = l1.val + l2.val + add;
            if (tmp >= 10) {
                tmp -= 10;
                ListNode newNode = new ListNode(tmp);
                add = 1;
                ptr.next = newNode;
                ptr = ptr.next;
            } else {
                ListNode newNode = new ListNode(tmp);
                add = 0;
                ptr.next = newNode;
                ptr = ptr.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l2 != null) {

            if ((l2.val + add) >= 10) {
                l2.val = l2.val + add - 10;
                add = 1;
            } else {
                l2.val += add;
                add = 0;
            }
            ptr.next = l2;
            ptr = ptr.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            if ((l1.val + add) >= 10) {
                l1.val = l1.val + add - 10;
                add = 1;
            } else {
                l1.val += add;
                add = 0;
            }
            ptr.next = l1;
            ptr = ptr.next;
            l1 = l1.next;
        }
        if (add == 0)
            return head.next;
        else {
            ListNode newNode = new ListNode(1);
            ptr.next = newNode;
            return head.next;
        }
    }
}
