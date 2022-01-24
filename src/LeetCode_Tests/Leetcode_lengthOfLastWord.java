package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode_lengthOfLastWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int res =  lengthOfLastWord(input);
        System.out.println(res);
    }

    public static int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        int index = 0;
        int ptr = s.length()-1;

        while(s.charAt(ptr)==' '){
            ptr--;
        }
        while(ptr>=0){
            if(s.charAt(ptr)!=' '){
                index++;
                ptr--;
            }else{
                return index;

            }
        }
        return index;
        //return s.split(" ")[s.split(" ").length-1].strip().length();
    }
}
