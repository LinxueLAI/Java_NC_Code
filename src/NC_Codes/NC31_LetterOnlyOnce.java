package NC_Codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class NC31_LetterOnlyOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        System.out.println(findLetterOnlyOnce(str));
    }

    private static int findLetterOnlyOnce(String str) {

        int word[] = new int[58];// 26*2 = 52 letters : A~Z : 65~90; a~z : 97~122. 122-65 =57
        for (int i = 0; i < str.length(); i++) {
            word[(int)str.charAt(i)-65]+=1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(word[(int)str.charAt(i)-65]==1)
                return i;
        }

        return  -1;
    }
}
