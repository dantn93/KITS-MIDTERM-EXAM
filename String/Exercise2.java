package String;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(takeMiddle("abc"));
        System.out.println(takeMiddle("abcd"));
        System.out.println(takeMiddle("abecd"));
        System.out.println(takeMiddle("a"));
        System.out.println(takeMiddle(""));
    }

    public static String takeMiddle(String str) {
        String[] input = str.split("");
        int index = input.length / 2;

        return input[index];
    }
}