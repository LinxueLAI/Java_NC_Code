package NC_Codes;

import java.util.Scanner;

public class NC66_FindFirstCommonNode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode node1 = new ListNode(1);
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            node1.addNode(sc.nextInt());
        }
        node1.printList();


        ListNode node2 = new ListNode(1);
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            node2.addNode(sc.nextInt());
        }
        node2.printList();

        ListNode result = findFirstCommonNode(node1, node2);
    }

    //两个指针，同样的速度，走完同样长度（链表1+链表2），不管两条链表有无相同节点，都能够到达同时到达终点
    private static ListNode findFirstCommonNode(ListNode node1, ListNode node2) {
        ListNode pA = node1, pB = node2;
        while (pA != pB) {
            if (pA != null)
                pA = pA.next;
            else pA = node2;
            if (pB != null)
                pB = pB.next;
            else pB = node1;
        }
        return pA;
    }
}
