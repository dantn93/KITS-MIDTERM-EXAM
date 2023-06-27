package Bai2;

import java.util.ArrayList;
import java.util.List;

public class HW2 {
    // 1.Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String> (1d)
    public List<String> convert(String[] strs){
        List<String> results = new ArrayList<>();
        for(String a : strs){
            results.add(a);
        }
        return results;
    }

    // 2. Viết hàm swap 2 vị trí trong 1 collection (2d)
    public void swap(List<String> strs, int first, int second){
        // strs.set(first, strs.get(second));
        // strs.set(second, strs.get(first));
        String temp =  strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, temp);
    }

    // 3. Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó (3d)
    public int wordCounter(String text, String word){
        if (text.length()==0){
            return 0;
        }
        
        int results = 0;
        String[] text2 = text.replace(",","").split(" ");
        for(String s : text2){
            if (s.equals(word)){
                results++;
            }
        }
        return results;
    }
}
