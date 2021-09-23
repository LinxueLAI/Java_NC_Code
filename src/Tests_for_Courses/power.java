package Tests_for_Courses;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int a = 2;
        int b = 16;
        int result = calculatePower(a,b);
        System.out.println(result);
    }

    private static int calculatePower(int a, int b) {

        if(b==0)return 1;
        else return a* calculatePower(a,b-1);
    }

}
