//2.Viết hàm swap 2 vị trí trong 1 collection (2d)
package Collection;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        String chuoi = "aaabcc 123 123";
        int i=2;
        int y=3;
        char vitri1= chuoi.charAt(i); 
        char vitri2= chuoi.charAt(y);
    
        
        //chuoi.charAt(i)=chuoi.charAt(y);
        

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
