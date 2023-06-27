import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeOddOnly("xyz"))); // ["x", "z"]
        System.out.println(Arrays.toString(takeOddOnly("abcd"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeOddOnly(""))); // []
    }

    public static String[] takeOddOnly(String str) {
        if (str == null || str.isEmpty()) {
            return new String[0];
        }

        int length = (str.length() + 1) / 2;
        String[] oddChars = new String[length];

        for (int i = 0; i < length; i++) {
            oddChars[i] = String.valueOf(str.charAt(i * 2));
        }

        return oddChars;
    }
}
