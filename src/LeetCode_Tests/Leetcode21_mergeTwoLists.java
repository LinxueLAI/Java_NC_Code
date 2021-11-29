package LeetCode_Tests;

public class Leetcode21_mergeTwoLists {
    public static void main(String[] args) {

        // create two lists
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode res = mergeTwoLists(l1, l2);
        ListNode res2 = mergeTwoLists2(l1,l2);
    }

    // 这个方法比较神奇，没有使用额外的空间
    private static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = l1.val < l2.val ? l1 : l2;
        res.next = mergeTwoLists(res.next, l1.val >= l2.val ? l1 : l2);
        return res;
    }

    // 这个方法是用空间换了时间。
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        return dummyHead.next;
    }
}
