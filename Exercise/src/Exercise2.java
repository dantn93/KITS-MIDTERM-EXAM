import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
    // 1. Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String> (1d)
    List<String> convert(String[] strs) {
        List<String> list = new ArrayList<>();
        for(String s : strs) {
            list.add(s);
        }
        return list;
    }

    // 2. Viết hàm swap 2 vị trí trong 1 collection 
    void swap(List<String> strs, int first, int second) {
        List<String> list = new ArrayList<>();
        
        String valueFirst = list.get(first);
        String valueSecond = list.get(second);

        list.set(first, valueSecond);
        list.set(second, valueFirst);
    }

    
    // 3. Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó 
    int wordCounter(String text, String word) {
        String[] strs = text.split("");

        Map<String, Integer> strCount = new HashMap<>();

        // Phương thức getOrDefault(Object key, V defaultValue): Nó sẽ tìm giá trị được liên kết 
        // hoặc ánh xạ tới key được chỉ định trong HashMap
        for (String str : strs) {
            // Thêm từng phần tử trong chars làm key của charCount lấy default value là 1
            // Nếu như key đã tồn tại thì lấy value + 1
            strCount.put(str, strCount.getOrDefault(str, 0) + 1);
        }
        return strCount.get(word);
    }
}
