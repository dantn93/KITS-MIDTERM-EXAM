import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseCollection {
    public static void main(String[] args) {
        System.out.println("Result Q1: ");
        System.out.println(convert(new String[] { "a", "b", "c" })); // ArrayList { "a", "b", "c" }
        System.out.println(convert(new String[] {})); // ArrayList {}
        System.out.println("Result Q2: ");
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
        swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
        System.out.println("Result Q3: ");
        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"));
    }
    //1.Viết hàm nhận vào 1 mảng các ký tự, trả về 1 List<String>
    static List<String> convert(String[] strs){
       List<String> stringList = new ArrayList<>();
        for (String s : strs) {
            stringList.add(s);
        }
        return stringList; 
    }
    //2.Viết hàm swap 2 vị trí trong 1 collection
    static void swap(List<String> strs, int first, int second){
        Collections.swap(strs, first, second);
        System.out.println(strs);
    }
    //3.Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó 
    static int wordCounter(String text, String word){
        String[] words = text.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
