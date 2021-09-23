package Other_Tests;

import org.xml.sax.Parser;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        String message = "hello Word \"Linxue\"" + "!!";
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        final float PI = 3.14F;// final means it is a constant.

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        System.out.println(Arrays.toString(numbers));
        System.out.println(matrix);
        System.out.println(Arrays.deepToString(matrix));

 */
/*
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String result = percentInstance.format(1234567.891);

        String result2 =NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);

 */

        /*
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine().trim();
        System.out.println("You are " + age);

        System.out.println("Principal:"); //100000
        Scanner scanner1 = new Scanner(System.in);
        double principal = scanner.nextDouble();
        System.out.println("Annual Interest Rate:");//3.92
        float rate = scanner.nextFloat();

        System.out.println("Period (Year):");

        long year = scanner.nextLong();

        double result0 = principal*(rate*Math.pow(1+rate,year))/ (Math.pow(1+rate,year)-1);
       String result = NumberFormat.getCurrencyInstance().format(
               result0
       );//472.82
        System.out.println("Mortgage result = "+ result );

         */
/*
        int income = 120_000;
        boolean hasHighIncome;

        String className = income>100_000 ? "Great" :"No!";
        System.out.println(className);

 */
        int columnNumber = 701;
        String str = "";
        while (columnNumber % 26 > 0) {
            str += (char) (columnNumber % 26 + (int) 'A' - 1);
            columnNumber = columnNumber / 26; //shang
            System.out.println(str);
        }
        str += (char) (columnNumber - 1 + (int) 'A');

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

    }
//701/26 = 26 ....25
//
//    26 / 26 = 1 ...0 (end)
}
