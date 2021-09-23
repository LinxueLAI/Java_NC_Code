package Tests_for_Courses;

import java.util.*;

public class NC_week1 {

    public static void main(String[] args) {
        // 1. The use of set
        Set<Integer> set = new HashSet<>(5);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);

        System.out.println(set);// sout+enter

        for(int i = 0;i<set.size();i++){
            System.out.println(set.remove(1));
        }
        System.out.println(set);

        // 2. The use of Map
        Map<Integer,String> testMap = new HashMap<Integer,String>();
        testMap.put(1,"test1");
        testMap.put(4,"test4");
        testMap.put(2,"test2");
        testMap.put(3,"test3");

        System.out.println(testMap.keySet());
        System.out.println(testMap.values());

        // 3. The use of iterator
        for(Iterator it = set.iterator(); it.hasNext();){
            System.out.println(it.next().toString());
        }

        // 4. The use of Stack
        Stack<Integer> testStack = new Stack<>();

        testStack.add(1);
        testStack.add(3);
        testStack.add(2);

        System.out.println(testStack);

        testStack.pop();
        testStack.pop();

        System.out.println(testStack.peek());

        //4.1 Use of LinkedList to implement a stack
        LinkedList<Integer> linkStack = new LinkedList<>();
        linkStack.addFirst(3); // add elt to top of stack
        linkStack.addFirst(0);
        linkStack.addFirst(8);
        System.out.println(linkStack);
        linkStack.pollFirst(); // poll first elt -> FILO
        System.out.println(linkStack);

        //4.2 Use of a LinkedList to implement a queue
        LinkedList<Integer> linkQueue = new LinkedList<>();
        linkQueue.offerLast(5); // add elt to the end to queue
        linkQueue.offerLast(4);
        linkQueue.offerLast(9);
        System.out.println(linkQueue);
        linkQueue.pop(); // pop the earliest elt ->  FIFO
        System.out.println(linkQueue);
        linkQueue.pop();
        System.out.println(linkQueue);

    }
}
