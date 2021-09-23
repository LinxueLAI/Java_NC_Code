package NC_Codes;

import java.util.Scanner;

public class NC25_deleteDuplicates {
    public static void main(String[] args) {

        ListNode node = new ListNode(1);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            node.addNode(sc.nextInt());
        }
        node.printList();

        ListNode result = deleteDuplicates(node);
        result.printList();
    }

    private static ListNode deleteDuplicates(ListNode head) {
        /*
        1 1 2
        1 2 2
         */
        if (head==null) return head;
        ListNode tmp = head;
        while (tmp.next!=null){
            if(tmp.val==tmp.next.val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return head;
    }
}
