package Tests_for_Courses;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            words[i] = sc.next();
        }
        int res = recycleWords(words);
        System.out.println(res);
    }

    private static int recycleWords(String[] words) {
        if (words.length == 0) return 0;
        if (words.length == 1) return 1;
        int[] index = new int[words.length];
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            if (index[i]==0){
                index[i]=1;
                res +=1;
                String[] allCases = getAllPossibleCases(words[i]);
                for (int j = i+1; j < words.length; j++) {
                    for (int i1 = 0; i1 < allCases.length; i1++) {
                        if(allCases[i1].equals(words[j]))
                            index[j]=1;
                    }
                }
            }
        }

        return res;
    }

    private static String[] getAllPossibleCases(String word) {
        int maxLength = word.length();

        String[] res = new String[maxLength];

        String word_tmp = word;
        for (int i = 0; i < maxLength; i++) {
            String word_add = word_tmp.substring(1).concat(word_tmp.substring(0, 1));
            res[i] = word_add;
            word_tmp = word_add;
        }
        return res;
    }
}
