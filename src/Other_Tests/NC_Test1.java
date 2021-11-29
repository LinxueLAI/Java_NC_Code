package Other_Tests;

import java.util.HashMap;
import java.util.Scanner;

public class NC_Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(same(str1, str2));
    }

    private static boolean same(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
            return false;
        char[] cArray1 = str1.toCharArray();
        char[] cArray2 = str2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.get(cArray1[i])==null) {
                map.put(cArray1[i], 1);
            } else {
                map.put(cArray1[i], map.get(cArray1[i]) + 1);
            }

        }

        for (int i = 0; i <str2.length(); i++) {
            if(map.get(cArray2[i])!=null){
                map.put(cArray2[i], map.get(cArray1[i]) - 1);
            }
            else
                return false;
        }

        return true;
    }
}
