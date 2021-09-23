package NC_Codes;

import java.util.Scanner;

public class NC112_BaseConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(baseConversion(m, n));
    }

    private static String baseConversion(int m, int n) {
        // 8  2
        /*
        8 -> 1000
        8/2 = 4 ... 0
        4/2 = 2 ... 0
        2/2 = 1 ... 0
        1/2 = 0 ... 1
         */

        String symbol = "";
        if (m < 0) {
            symbol = "-";
            m = -m;
        }
        StringBuilder result = new StringBuilder();
        while (m / n != 0) {
            int res = m % n;
            if (n > 10 && res >= 10)
                result.append((char) (res - 10 + 'A'));
            else
                result.append(res);
            m /= n;
        }
        result.append(m % n);
        result.append(symbol);
        return result.reverse().toString();
    }
}
