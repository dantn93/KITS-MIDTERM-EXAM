package NgoThanhTan_07.string;

import java.util.Arrays;

public class Bai1 {
    public static String[] takeHeadAndTail(String str) {
        String[] res = new String[2];
        if (str.length() == 0) {
            res[0] = "";
            res[1] = "";
        } else {
            String[] input = str.split("");
            res[0] = input[0];
            res[1] = input[input.length - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeHeadAndTail("abc")));
        System.out.println(Arrays.toString(takeHeadAndTail("a")));
        System.out.println(Arrays.toString(takeHeadAndTail("")));
    }
}
