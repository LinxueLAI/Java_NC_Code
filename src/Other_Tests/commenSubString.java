 
import java.util.*;
import java.util.Stack;

public class commenSubString {

    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("abc1234321ab",12));
    }
    public static int getLongestPalindrome(String A, int n) {
        // write code here
        if (n <= 1) return n;
        Stack<Character> stack = new Stack<>();
        stack.push(A.charAt(0));
        for (int i = 1; i < n; i++) {
            stack.push(A.charAt(i));
            System.out.println(stack.size());
        }

        System.out.println(A.length());
        StringBuilder reverse_str = new StringBuilder(stack.pop().toString());
        while (!stack.isEmpty()) {
            reverse_str.append(stack.pop());
        }

        System.out.println("A="+A);
        System.out.println("reverse_str ="+reverse_str);

        int[][] dp = new int[n + 1][n + 1];
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (reverse_str.charAt(i - 1) == A.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(result<dp[i][j] && (i+j-dp[i][j]==n)){
                        result =dp[i][j];
                        System.out.println("i = "+i);
                        System.out.println("j = "+j);
                        System.out.println("result = "+result);
                    }
                } else dp[i][j] = 0;

            }
        }

        if(n==256){
            System.out.println("a : "+A.substring(21,28));
            System.out.println(A.substring(20,27));
            System.out.println(reverse_str.substring(219,226));
            System.out.println(reverse_str.substring(218,225));
        }
        return result;

/*        // Create DP table
        int dp[][]=new int[2][n+1];
        int res=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(A.charAt(i-1)==reverse_str.charAt(j-1))
                {
                    dp[i%2][j]=dp[(i-1)%2][j-1]+1;
                    if(dp[i%2][j]>res)
                        res=dp[i%2][j];
                }
                else dp[i%2][j]=0;
            }
        }
        return res;


         */
    }
}