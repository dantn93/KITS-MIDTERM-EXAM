import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeHeadAndTail("abc"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeHeadAndTail("a"))); // ["a", "a"]
        System.out.println(Arrays.toString(takeHeadAndTail(""))); // ["", ""]
    }

    public static String[] takeHeadAndTail(String str) {
        if (str.length() == 0) {
            return new String[]{"", ""};
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            return new String[]{Character.toString(firstChar), Character.toString(lastChar)};
        }
    }
}
