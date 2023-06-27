package Bai2;

import java.util.ArrayList;
import java.util.List;

//Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String> (1d)
public class Lab01 {
    public static void main(String[] args) {
        System.out.println( convert(new String[] { "a", "b", "c" }));
        System.out.println(convert(new String[] {}));
        // ArrayList { "a", "b", "c" }
        // ArrayList {}
    }
    public static List<String> convert(String[] charArray){
        List<String> result = new ArrayList<>();
        for (String c : charArray) {
            result.add(String.valueOf(c));
        }
        return result;
    }
}
