package src.Collection;

// Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1 {
    static List<String> convert(String[] strs) {
        return new ArrayList<>(Arrays.asList(strs));
    }

    public static void main(String[] args) {
        System.out.println(convert(new String[] { "a", "b", "c" })); // ArrayList { "a", "b", "c" }
        System.out.println(convert(new String[] {})); // ArrayList { }
    }
}
