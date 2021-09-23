package Tests_for_Courses;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Integer n = 7;
        Integer result = deleteNToGetEven(n);
        System.out.println(result);
        System.out.println(deleteNToGetEven(12321));
        System.out.println(deleteNToGetEven(102));
        assert (deleteNToGetEven(7) == -1);
        assert (deleteNToGetEven(12321) == 1);

        Scanner scanner = new Scanner(System.in);

        System.out.println(deleteNToGetEven(scanner.nextInt()));
    }

    private static Integer deleteNToGetEven(Integer n) {
        if (n > 0) { // 考虑正整数
            if (n % 2 == 0) //偶数不需要操作
                return 0;
            else if (n < 10) //小于10的奇数无法操作
                return -1;
            else { // 奇数，大于10只需要找到最靠右的偶数的位置
                int t = 0;
                do {
                    n /= 10; // 做一次操作 = 1232
                    t += 1;
                } while (n % 2 == 1 && n >= 10);

                if(n%2==0) return t;
                else return -1;

            }

        } else return -1;
    }
}
