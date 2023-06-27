import java.util.ArrayList;

public class Ex3 {
    // Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
    public static void main(String[] args) {
        // takeOddOnly("xyz"); // ["x", "z"]
        // takeOddOnly("abcd"); // ["a", "c"]
        // takeOddOnly(""); // []

    }

    public static String[] takeOddOnly(String str) {
        ArrayList<String> oddChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                oddChars.add(String.valueOf(str.charAt(i)));
            }
        }

        return oddChars.toArray(new String[oddChars.size()]);
    }

}
