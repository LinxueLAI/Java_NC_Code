package Tests_for_Courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//set 的应用
public class Test4_3_qiNuNuo {
    public static void main(String[] args) throws IOException {
        exist();

    }

    private static void exist() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        String[] third = br.readLine().split(" ");
        int x = Integer.parseInt(first[2]);

        Set<Integer> set= new HashSet<>();
        for (int i = 0; i < second.length; i++) {
            set.add(x-Integer.parseInt(second[i]));
        }
        for (int i = 0; i < third.length; i++) {
            if(set.contains(Integer.parseInt(third[i]))){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
