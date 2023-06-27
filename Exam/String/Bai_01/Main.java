package Exam.String.Bai_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        takeHearAndTail("abc");
    }

    public static void takeHearAndTail(String str) {
        int length = str.length();

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (length > 0) {
            System.out.print(firstChar + " " + lastChar);
        } else if (length == 1) {
            System.out.println(firstChar + " " + firstChar);
        } else {
            System.out.println(" " + " ");
        }

    }
}
