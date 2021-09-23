package NC_Codes;

import java.util.Scanner;

public class NC155_gcd {
    // idea :  用辗转相除法（又称欧几里得算法）来计算两个数的最大公约数 (Greatest Common Divisor)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));

    }

    public static int gcd (int a, int b) {
        // write code here
        int rest = a %b;
        if(rest==0) return b;
        else return gcd(b,rest);
    }

}
