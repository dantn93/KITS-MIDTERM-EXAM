import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // b1
        takeHeadAndTail("abc"); // ["a", "c"]
        takeHeadAndTail("a"); // ["a", "a"]
        takeHeadAndTail(""); // ["", ""]

        // b2
        takeMiddle("abc"); // "b"
        takeMiddle("abcd"); // "c"
        takeMiddle("abecd"); // "e"
        takeMiddle("a"); // "a"
        takeMiddle(""); // ""

        // bt3
        takeOddOnly("xyz"); // ["x", "z"]
        takeOddOnly("abcd"); // ["a", "c"]
        takeOddOnly(""); // []

        // bt4
        convert(new String[] { "a", "b", "c" }); // ArrayList { "a", "b", "c" }
        convert(new String[] {}); // ArrayList { "a", "b", "c" }

        // bt5

        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
        swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
    }

    // 1 Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    public static void takeHeadAndTail(String str) {
        char first;
        char last;
        List arr = new ArrayList<>();
        if (str == "" || str.length() == 0) {
            arr.add("");
            arr.add("");
        } else {
            first = str.charAt(0);
            last = str.charAt(str.length() - 1);

            arr.add(first);
            arr.add(last);
        }

        System.out.println("arr :" + arr);

    }

    // 2 Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
    public static void takeMiddle(String str) {
        char middle;
        int midPosition = str.length() / 2;
        List arr = new ArrayList<>();
        if (str == "" || str.length() == 0) {
            arr.add("");
        } else {
            middle = str.charAt(midPosition);
            arr.add(middle);
        }
        System.out.println("Middle character: " + arr);
    }

    // 3- Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
    public static void takeOddOnly(String str) {
        String oddString;
        List arrOddString = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 > 0) {
                arrOddString.add(str.charAt(i));
            }
        }
        oddString = arrOddString.toString();
        System.out.println("oddString: " + oddString);
    }

    // 4-Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String> (1d)
    public static void convert(String[] strs) {
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            listString.add(strs[i]);
        }

        System.out.println("List<String>: " + listString);

    }

    // 5- Viết hàm swap 2 vị trí trong 1 collection (2d)
    public static void swap(List<String> strs, int first, int second) {
        String str1;
        String str2;

        str1 = strs.get(first);

        str2 = strs.get(second);

        strs.remove(first);

        strs.add(second, str1);

        strs.remove(second);

        strs.add(first, str2);
        System.out.println("Strs: " + strs);
    }

    // 6
    public static String wordCounter(String text, String word) {

        return word;
    }

}