package String;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        String[] result1 = takeOddOnly("xyzasd");
        System.out.println(Arrays.toString(result1));

    }

    public static String[] takeOddOnly(String str) {
        String[] result = new String[(str.length() + 1) / 2];

        for (int i = 0; i < str.length(); i += 2) {
            result[i / 2] = String.valueOf(str.charAt(i));
        }
        return result;
    }

}
