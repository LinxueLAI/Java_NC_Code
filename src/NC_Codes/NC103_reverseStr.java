package NC_Codes;

import java.util.Scanner;

public class NC103_reverseStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String result = reverseStr(str);
        System.out.println(result);
    }

    private static String reverseStr(String str) {

        if(str.length()==0)
            return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}
