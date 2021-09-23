package Tests_for_Courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

//双头队列 deque的应用
public class Test4_2_orderTasks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nb = Integer.parseInt(br.readLine());
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        Deque<String> deque = new LinkedList<>();
        for (int i = 0; i < nb; i++) {
            String[] tmp = br.readLine().split(" ");
            int score_tmp = Integer.parseInt(tmp[1]);
            if (deque.isEmpty()) {
                deque.offerFirst(tmp[0]);
                max = score_tmp;
                min = score_tmp;
            } else if (score_tmp > max) {
                deque.offerLast(tmp[0]);
                max = score_tmp;
            } else if (score_tmp < min) {
                deque.offerFirst(tmp[0]);
                min = score_tmp;
            }
        }
        System.out.println(deque.size());
        for(int i=deque.size();i>0;i--){
            System.out.println(deque.pollFirst());
        }

    }
}
