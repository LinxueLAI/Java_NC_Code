package NC_Codes;

public class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int data) {
        this.val = data;
    }

    public void addNode(int i) {
        ListNode newNode = new ListNode(i);

        if (next == null) {
            next = newNode;
            return;
        } else {
            ListNode tmp = next;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            // add new Node to the end
            tmp.next = newNode;
        }
    }

    public void printList() {
        ListNode tmp = next;
        while (tmp != null) {
            System.out.println(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

}
