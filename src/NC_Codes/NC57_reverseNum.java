package NC_Codes;

import java.util.Scanner;

public class NC57_reverseNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = reverse(n);
        System.out.println(result);

    }

    private static int reverse(int n) {
        long result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10;
            result *= 10;
        }
        result/=10;
        return (int) result == result ? (int) result : 0;
    }
}
