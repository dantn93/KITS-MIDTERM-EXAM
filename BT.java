import java.util.ArrayList;
import java.util.List;

public class BT {

    // 1. Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    public String[] takeHeadAndTail(String s) {
        String[] result = new String[2];
        if (s == "") {
            result[0] = "";
            result[1] = "";
            return result;
        }
        result[0] = s.charAt(0) + "";
        result[1] = s.charAt(s.length() - 1) + "";

        return result;
    }

    // 2. Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
    public String takeMiddle(String str) {
        if (str.length() == 0)
            return "";
        int index = str.length() / 2;
        return str.charAt(index) + "";
    }

    // 3. Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
    public String[] takeOddOnly(String str) {
        int length = str.length() / 2;
        if (str.length() % 2 == 1)
            length++;
        System.out.println(length);
        String[] result = new String[length];
        int k = 0;
        for (int i = 0; i < str.length(); i = i + 2) {
            result[k] = str.charAt(i) + "";
            k++;
        }
        return result;
    }

    // Bài 2: Collection
    // 1. Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String> (1d)
    public List<String> convert(String[] strs) {
        List<String> result = new ArrayList<>();
        for (String c : strs)
            result.add(c);
        return result;
    }

    // 2. Viết hàm swap 2 vị trí trong 1 collection (2d)
    public void swap(List<String> strs, int first, int second) {
        String tmp = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, tmp);
    }

    // 3. Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó
    // (3d)
    public int wordCounter(String text, String word) {
        text = text.replaceAll(",", "");
        String[] t = text.split(" ");
        int count = 0;
        for (String s : t) {
            if (s.equals(word))
                count++;
        }
        return count;
    }

}
