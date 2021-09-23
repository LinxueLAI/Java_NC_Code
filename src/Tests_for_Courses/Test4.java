package Tests_for_Courses;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int res = getLongestContinuous(str1, str2);

        System.out.println(res);
    }

    private static int getLongestContinuous(String str1, String str2) {

        if(str1.isEmpty() || str2.isEmpty()) return 0;
        int res = 0;
        int begin;
        int end;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    begin = i;
                    i += 1;
                    j += 1;
                    while (i < str1.length()
                            && j < str2.length()
                            && str1.charAt(i) == str2.charAt(j)
                    ) {
                        i+=1;
                        j+=1;
                    }
                    end = i;
                    if(end-begin>res) res = end-begin;

                    break;
                }
            }
        }

        return res;
    }
}
