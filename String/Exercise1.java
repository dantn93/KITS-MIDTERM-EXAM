package String;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        String[] result1 = takeHeadAndTail("abc");
        System.out.println(Arrays.toString(result1));

    }

    public static String[] takeHeadAndTail(String str) {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        return new String[] { String.valueOf(firstChar), String.valueOf(lastChar) };

    }
}
