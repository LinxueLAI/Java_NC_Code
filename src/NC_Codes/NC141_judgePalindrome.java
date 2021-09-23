package NC_Codes;

import java.util.Scanner;

public class NC141_judgePalindrome {
    // idea :  judge half of the elements in list
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(judgePalindrome(str));
    }

    private static boolean judgePalindrome(String str) {

        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i)!=str.charAt(length-1-i))
                return false;
        }

        return true;
    }
}
