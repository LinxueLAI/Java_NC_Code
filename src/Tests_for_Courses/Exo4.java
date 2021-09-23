package Tests_for_Courses;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        BigDecimal n= sc.nextBigDecimal();
        System.out.println(n+"^2");
        System.out.print("=");
        calculateBigNumberByHeart(n);

        */

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(n + "^" + 2);
        get(n);
    }

    private static void get(long n) {
        StringBuilder builder = new StringBuilder();
        builder.append("=");
        while (n > 0) {
            String nString = String.valueOf(n);
            long s1 = Integer.parseInt(nString.charAt(0) + "");
            long s2 = Integer.parseInt(nString.charAt(0) + "") + 1;

            for (int i = 0; i < nString.length() - 1; i++) {
                s1 *= 10;//
                s2 *= 10;
            }
            System.out.println("s1=" + s1);
            System.out.println("s2=" + s2);
            // s1<=s2
            if (Math.abs(s1 - n) >= Math.abs(s2 - n)) {
                long a = n * 2 - s2;
                long x = n - a;
                if (x != 0) {
                    builder.append(a + "*" + s2 + "+");
                    System.out.println(builder.toString() + x + "^" + 2);
                } else {
                    builder.append(s1 + "*" + s1);
                    System.out.println(builder.toString());
                }

                n = x;

            } else {
                long x = n - s1;
                if (x != 0) {
                    builder.append(s1 + "*" + (s1 + 2 * x) + "+");
                    System.out.println(builder.toString() + x + "^" + 2);
                } else {
                    builder.append(s1 + "*" + s1);
                    System.out.println(builder.toString());
                }
                n = x;
            }
        }

    }
/*
    private static void calculateBigNumberByHeart(BigDecimal n) {

        // find (a+x)^2 = a*(a+2x) +x^2
        BigDecimal left = n.pow(2); // result
        int k = n.toString().length();
        double a_10 = Math.pow(10, k - 1);
        BigDecimal right;
        int x = 0;

        do {
            x+=1;
            double a = x*a_10;
            double another_facotr_k = 0;
            right = new BigDecimal(a * (a + 2 * x) + Math.pow(x, 2));
        } while (!Objects.equals(left, right));

    } */

}
