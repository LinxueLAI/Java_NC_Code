package Tests_for_Courses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a1 = scanner.nextInt();
        Integer a2 = scanner.nextInt();
        Integer a3 = scanner.nextInt();
        Integer result = scanner.nextInt();

        String str = getEquation(a1, a2, a3, result);
        System.out.println(str);
    }

    private static String getEquation(Integer a1, Integer a2, Integer a3, Integer result) {
        // forced solution : + - * / choose two of them
        Map<Integer, String> str = new HashMap<>();
        str.put(1, "+");
        str.put(2, "-");
        str.put(3, "*");
        str.put(4, "/");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                double result_final = 0;
                String pos1 = str.get(i);
                String pos2 = str.get(j);
                System.out.println("pos1 = " + pos1);
                System.out.println("pos2 = " + pos2);

                if (i >= j || (i < j && (pos2.equals("-") || pos1.equals("*")))) { //i<j :
                    double result1 = getResult((double) a1, pos1, (double) a2); //a1 a2 a3
                    System.out.println("result1 =" + result1);
                    result_final = getResult(result1, pos2, (double) a3);
                    System.out.println("i = " + i + ",j = " + j + ",result_final = " + result_final);
                } else {
                    double result1 = getResult((double) a2, pos2, (double) a3); //a1 a2 a3  9 - 2* 3 = 3
                    result_final = getResult((double) a1, pos1, result1);
                    System.out.println("result1 =" + result1);
                    System.out.println("i = " + i + ",j = " + j + ",result_final = " + result_final);

                }
                if (result_final == (double) result) return pos1 + " " + pos2;
            }
        }
        return "? ?";
    }

    private static double getResult(double a1, String pos1, double a2) {
        if (pos1 == "+") return a1 + a2;
        else if (pos1 == "-") return a1 - a2;
        else if (pos1 == "*") return a1 * a2;
        else return a1 / a2;
    }
}
