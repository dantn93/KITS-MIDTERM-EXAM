import java.util.Arrays;
import java.util.List;

public class Ex2 {
    // Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
    public static void main(String[] args) {
        // takeMiddle("abc"); // "b"
        // takeMiddle("abcd"); // "c"
        // takeMiddle("abecd"); // "e"
        // takeMiddle("a"); // "a"
        // takeMiddle(""); // ""

    }

    public static String takeMiddle(String str) {
        int midIndex = str.length() / 2;

        if (str.length() % 2 != 0) {

            return str.substring(midIndex, midIndex + 1);
        } else {

            return str.substring(midIndex - 1, midIndex + 1);
        }
    }

}
