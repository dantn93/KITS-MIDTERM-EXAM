import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    // Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    public static void main(String[] args) {
        // takeHeadAndTail("abc"); // ["a", "c"]
        // takeHeadAndTail("a"); // ["a", "a"]
        // takeHeadAndTail(""); // ["", ""]

    }

    public static String[] takeHeadAndTail(String str) {
        if (str.length() == 0) {
            return new String[] { "", "" };
        }

        String head = str.substring(0, 1);
        String tail = str.substring(str.length() - 1);

        return new String[] { head, tail };
    }

}