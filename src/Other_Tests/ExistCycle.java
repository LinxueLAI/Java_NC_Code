import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ExistCycle {

    public static void main(String[] args) {

    }


    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        int length = 0;
        if (head == null || head.next == null) return false;
        else {
            while(head != null && length==set.size()) {
                set.add(head);
                length+=1;
                head = head.next;
            }
            if (length!=set.size()) return true;
            else return false;
        }

    }

}
