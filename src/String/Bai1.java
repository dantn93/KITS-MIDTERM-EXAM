package src.String;

import java.util.Arrays;

// Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối

public class Bai1 {
    static String[] takeHeadAndTail(String str) {
        if (str.isEmpty()) {
            return new String[]{"", ""};
        } else {
            String[] rs = new String[2];
            rs[0] = String.valueOf(str.charAt(0));
            rs[1] = String.valueOf(str.charAt(str.length() - 1));
            return rs;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeHeadAndTail("abc"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeHeadAndTail("a"))); // ["a", "a"]
        System.out.println(Arrays.toString(takeHeadAndTail(""))); // ["", ""]
    }
}
