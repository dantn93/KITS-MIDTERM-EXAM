package src.String;

// Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai2 {
    static String takeMiddle(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() % 2 == 0) {
            int midIndex = str.length() / 2;
            return str.substring(midIndex, midIndex + 1);
        } else {
            int midIndex = str.length() / 2;
            return String.valueOf(str.charAt(midIndex));
        }
    }
    public static void main(String[] args) {
        System.out.println(takeMiddle("abc")); // "b"
        System.out.println(takeMiddle("abcd")); // "c"
        System.out.println(takeMiddle("abecd")); // "e"
        System.out.println(takeMiddle("a")); // "a"
        System.out.println(takeMiddle("")); // ""
    }
}
