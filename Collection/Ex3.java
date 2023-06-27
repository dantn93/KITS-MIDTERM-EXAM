//3.Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó (3d)
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        String word1 = "aaabcc 123 123";
        String text = "123";


        Map<String, Integer> counter1 = wordCounter(word1);
        System.out.println( word1 + "\": " + counter1);

    }

    public static Map<String, Integer> wordCounter(String word) {
        Map<String, Integer> counter = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi ký tự trong chuỗi
        for (int i = 0; i < word.length(); i++) {
            String character = String.valueOf(word.charAt(i));
            counter.put(character, counter.getOrDefault(character, 0) + 1);
        }

        return counter;
    }
}