package Tests_for_Courses;

import java.util.*;

import static java.util.Arrays.sort;
// 优先队列的应用priorityQueue
public class Test5_2_chikaAndOrange {

    public static class pair {
        int tian;
        int suan;

        public pair(int tian, int suan) {
            this.tian = tian;
            this.suan = suan;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] suan = new int[n];

        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() { //默认为小顶堆
            @Override
            public int compare(pair o1, pair o2) {
                System.out.println("o1 = "+o1.suan);
                System.out.println("o2 = "+o2.suan);

                if (o1.tian == o2.tian) {
                    System.out.println("equal");
                    System.out.println(o1.suan - o2.suan);
                    return o1.suan - o2.suan;
                } else {
                    System.out.println("not equal!");
                    System.out.println(o2.tian - o1.tian);

                    return o2.tian - o1.tian;
                }
                //重载为大顶堆
            }
        });

        for (int i = 0; i < n; i++) {
            suan[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            pair p = new pair(sc.nextInt(), suan[i]);
            pq.add(p);

        }

        long sum_tian = 0, sum_suan = 0;
        for (int i = 0; i < k; i++) {
            pair p = pq.poll();
            sum_tian += p.tian;
            sum_suan += p.suan;

        }

        System.out.print(sum_suan + " " + sum_tian);


    }
}
