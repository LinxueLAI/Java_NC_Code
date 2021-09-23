package LeetCode_Tests;

import java.util.*;

public class Leetcode168 {
    /*
    给定一个正整数，返回它在 Excel 表中相对应的列名称。
例如，

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...
     */
    public static void main(String[] args) {

        assert (convertToTitle(172) == "ZZ");
        assert (convertToTitle(52) == "AZ");
        assert (convertToTitle(1) == "A");


    }

    public static String convertToTitle(int columnNumber) {
        if (columnNumber <= 26)
            return "" + (char) (columnNumber - 1 + (int) 'A');
        else if (columnNumber % 26 == 0)
            return convertToTitle(columnNumber / 26 - 1) + "Z";
        else
            return convertToTitle(columnNumber / 26) + convertToTitle(columnNumber % 26);
    }
}
