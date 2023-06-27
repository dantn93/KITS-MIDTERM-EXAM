package src.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ

public class Bai3 {
    static String[] takeOddOnly(String str) {
        List<String> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i += 2) {
            chars.add(String.valueOf(str.charAt(i)));
        }
        return chars.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeOddOnly("xyz"))); // ["x", "z"]
        System.out.println(Arrays.toString(takeOddOnly("abcd"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeOddOnly(""))); // []
    }
}
