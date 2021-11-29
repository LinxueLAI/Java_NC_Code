package Java_fromZeroToExpert;

import java.util.Date;

public class Chapter5_String {

    public static void main(String[] args) {
        // 按照字典顺序比较两个字符串
        String str1 = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");

        System.out.println(str1+" compareTo "+str2+":");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1+" compareTo "+str3+":");
        System.out.println(str1.compareTo(str3));

        // 判断字符串是否相等
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        // 格式化字符串
        Date date = new Date();
        String year = String.format("%tY",date);
        String month = String.format("%tB",date);
        String day = String.format("%td",date);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
