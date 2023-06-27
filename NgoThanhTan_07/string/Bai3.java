package NgoThanhTan_07.string;

import java.util.Arrays;

public class Bai3 {
    public static String[] takeOddOnly(String str) {
        String[] input = str.split("");
        int size;
        if (input.length % 2 == 0) {
            size = input.length / 2;
        } else {
            size = input.length / 2 + 1;
        }
        String[] res = new String[size];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                res[index] = input[i];
                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeOddOnly("xyz")));
        System.out.println(Arrays.toString(takeOddOnly("abcd")));
        System.out.println(Arrays.toString(takeOddOnly("")));
    }
}
