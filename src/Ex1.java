import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeHeadAndTail("a")));
    }
    static String[] takeHeadAndTail(String str) {
        String[] strArr = str.split("");
        if (strArr.length == 0) {
            strArr[0] = "";
        }
        String[] array = new String[2];
        array[0] = strArr[0];
        array[1] = strArr[strArr.length - 1];
        return array;
    }
}
